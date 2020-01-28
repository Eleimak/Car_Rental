//package tam.group_bbv181.car_rentals.controllers.web;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//import tam.group_bbv181.car_rentals.forms.CarForm;
//import tam.group_bbv181.car_rentals.forms.CarListSearchForm;
//import tam.group_bbv181.car_rentals.model.*;
//import tam.group_bbv181.car_rentals.services.car.impls.CarServiceImpl;
//import tam.group_bbv181.car_rentals.services.companycar.impls.CompanyCarServiceImpl;
//import tam.group_bbv181.car_rentals.services.customer.impls.CustomerServiceImpl;
//import tam.group_bbv181.car_rentals.services.person.impls.PersonServiceImpl;
//import tam.group_bbv181.car_rentals.services.rentcar.impls.RentCarServiceImpl;
//
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//@RequestMapping("/CarRentals/car")
//@CrossOrigin("*")
//@Controller
//public class CompanyCarWebController {
//    @Autowired
//    CompanyCarServiceImpl companyCarService;
//    @Autowired
//    RentCarServiceImpl rentCarService;
//    @Autowired
//    PersonServiceImpl personService;
//    @Autowired
//    CustomerServiceImpl customerService;
//
//    /*
//
//    * LIST
//
//     */
//
//    @RequestMapping("/list")
//    public String showAll(Model model){
//        List<CompanyCar> list = companyCarService.getAll();
//
//        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        boolean isAuthenticated;
//        if(SecurityContextHolder.getContext().getAuthentication().getPrincipal() instanceof UserDetails) isAuthenticated = true;
//        else isAuthenticated = false;
//        if(isAuthenticated){
//            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//            LoginUser loginUser = (LoginUser) authentication.getPrincipal();
//            Person personLogin = personService.getPersonLoginUser(loginUser);
//            Customer customerLogin = customerService.getCustomerPerson(personLogin);
//            model.addAttribute("personLogin", customerLogin);
//        }
//        model.addAttribute("isAuthenticated", isAuthenticated);
//        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//        model.addAttribute("cars", list);
//        return "/car/carList";
//    }
//
//    /*
//
//    * LIST ACTIVE
//
//     */
//
//    @RequestMapping("/listR")
//    public String showNoRepair(Model model){
//        List<CompanyCar> listNoRepair = companyCarService.getAllNoRepair();
//        model.addAttribute("cars", listNoRepair);
//
//        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        boolean isAuthenticated;
//        if(SecurityContextHolder.getContext().getAuthentication().getPrincipal() instanceof UserDetails) isAuthenticated = true;
//        else isAuthenticated = false;
//        if(isAuthenticated){
//            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//            LoginUser loginUser = (LoginUser) authentication.getPrincipal();
//            Person personLogin = personService.getPersonLoginUser(loginUser);
//            Customer customerLogin = customerService.getCustomerPerson(personLogin);
//            model.addAttribute("personLogin", customerLogin);
//        }
//        model.addAttribute("isAuthenticated", isAuthenticated);
//        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//        return "/car/carList";
//    }
//
//    /*
//
//    * LIST TYPE CAR
//
//     */
//
//    @RequestMapping("/listSort")
//    public String showSort(Model model){
//        List<CompanyCar> list = companyCarService.getSortingByType(TypeCar.SEDAN);
//        model.addAttribute("cars", list);
//
//        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        boolean isAuthenticated;
//        if(SecurityContextHolder.getContext().getAuthentication().getPrincipal() instanceof UserDetails) isAuthenticated = true;
//        else isAuthenticated = false;
//        if(isAuthenticated){
//            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//            LoginUser loginUser = (LoginUser) authentication.getPrincipal();
//            Person personLogin = personService.getPersonLoginUser(loginUser);
//            Customer customerLogin = customerService.getCustomerPerson(personLogin);
//            model.addAttribute("personLogin", customerLogin);
//        }
//        model.addAttribute("isAuthenticated", isAuthenticated);
//        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//        return "/car/carList";
//    }
//
//    /*
//
//    * LIST SEARCH
//
//     */
//
//    @RequestMapping("/listSearch")
//    public String showSearch(Model model){
//        List<CompanyCar> list = companyCarService.getAll();
//        model.addAttribute("cars", list);
//
//        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        boolean isAuthenticated;
//        if(SecurityContextHolder.getContext().getAuthentication().getPrincipal() instanceof UserDetails) isAuthenticated = true;
//        else isAuthenticated = false;
//        if(isAuthenticated){
//            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//            LoginUser loginUser = (LoginUser) authentication.getPrincipal();
//            Person personLogin = personService.getPersonLoginUser(loginUser);
//            Customer customerLogin = customerService.getCustomerPerson(personLogin);
//            model.addAttribute("personLogin", customerLogin);
//        }
//        model.addAttribute("isAuthenticated", isAuthenticated);
//        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//        return "/car/carListSearch";
//    }
///*
//    @RequestMapping(value = "/search", method = RequestMethod.POST)
//    public String hello(Model model, @RequestParam(defaultValue = "") String searchName) {
//        List<List<String>> persons = repositoryService.getRepository();
//        List<List<String>> filterList = persons.stream()
//                .filter(p -> p.get(0).contains(searchName))
//                .collect(Collectors.toList());
//        model.addAttribute("persons", filterList);
//        model.addAttribute("lastSearch", searchName);
//        return "persons";
//    }
//    */
//
//    /*
//
//     * LIST GET
//
//     */
//
//    @RequestMapping(value = "/List", method = RequestMethod.GET)
//    public String list(Model model){
//        CarListSearchForm carListSearchForm = new CarListSearchForm();
//        List typeCar = new ArrayList();
//        typeCar.add(" ");
//        typeCar.add(TypeCar.CONVERTIBLE);
//        typeCar.add(TypeCar.COUPE);
//        typeCar.add(TypeCar.PIC_UP_VEHICLE);
//        typeCar.add(TypeCar.SEDAN);
//        typeCar.add(TypeCar.HATCHBACK);
//        typeCar.add(TypeCar.MUV_SUV);
//        typeCar.add(TypeCar.VAN);
//        typeCar.add(TypeCar.WAGON);
//        model.addAttribute("TypeCar", typeCar);
//        List yearCar = new ArrayList();
//        yearCar.add(" ");
//        int nowYear = LocalDate.now().getYear();
//        for (Integer i = nowYear; i >= 2000; i--) {
//            yearCar.add(i.toString());
//        }
//        model.addAttribute("YearCar", yearCar);
//        model.addAttribute("CarListSearchForm", carListSearchForm);
//        List repairCar = new ArrayList();
//        repairCar.add(" ");
//        repairCar.add("yes");
//        repairCar.add("no");
//        model.addAttribute("RepairCar", repairCar);
//
//        List<CompanyCar> list = companyCarService.getAll();
//        model.addAttribute("cars", list);
//
//        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        boolean isAuthenticated;
//        if(SecurityContextHolder.getContext().getAuthentication().getPrincipal() instanceof UserDetails) isAuthenticated = true;
//        else isAuthenticated = false;
//        if(isAuthenticated){
//            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//            LoginUser loginUser = (LoginUser) authentication.getPrincipal();
//            Person personLogin = personService.getPersonLoginUser(loginUser);
//            Customer customerLogin = customerService.getCustomerPerson(personLogin);
//            model.addAttribute("personLogin", customerLogin);
//        }
//        model.addAttribute("isAuthenticated", isAuthenticated);
//        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//        return "/car/carListFind";
//    }
//
//    /*
//
//     * LIST POST
//
//     */
//    @RequestMapping(value = "/List", method = RequestMethod.POST)
//    public String list(Model model,@ModelAttribute("CarListSearchForm")
//            CarListSearchForm carListSearchForm){
//        List<CompanyCar> list = new ArrayList<>();
//        if(!carListSearchForm.getCarYear().equals(" ")){
//
//            return "/car/carListFind";
//        }
//
//            list = companyCarService.getSortingByType(carListSearchForm.getTypeCar());
//            model.addAttribute("cars", list);
//
//        List typeCar = Arrays.asList( TypeCar.values());
//        model.addAttribute("typeCar", typeCar);
//        List yearCar = new ArrayList();
//        int nowYear = LocalDate.now().getYear();
//        for (Integer i = nowYear; i >= 2000; i--) {
//            yearCar.add(i.toString());
//        }
//        model.addAttribute("yearCar", yearCar);
//        String error = "All fields must be filled!";
//        model.addAttribute("errorMessage", error);
//        return "/car/carListFind";
//    }
//
//
//
//
//    /*
//
//    * CREATE GET
//
//     */
//
//    @RequestMapping(value = "/create", method = RequestMethod.GET)
//    public String addCar(Model model){
//        CarForm carForm = new CarForm();
//        List typeCar = Arrays.asList( TypeCar.values());
//        model.addAttribute("typeCar", typeCar);
//        List yearCar = new ArrayList();
//        int nowYear = LocalDate.now().getYear();
//
//        for (Integer i = nowYear; i >= 2000; i--) {
//            yearCar.add(i.toString());
//        }
//        model.addAttribute("yearCar", yearCar);
//        model.addAttribute("CarForm", carForm);
//
//        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        boolean isAuthenticated;
//        if(SecurityContextHolder.getContext().getAuthentication().getPrincipal() instanceof UserDetails) isAuthenticated = true;
//        else isAuthenticated = false;
//        if(isAuthenticated){
//            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//            LoginUser loginUser = (LoginUser) authentication.getPrincipal();
//            Person personLogin = personService.getPersonLoginUser(loginUser);
//            Customer customerLogin = customerService.getCustomerPerson(personLogin);
//            model.addAttribute("personLogin", customerLogin);
//        }
//        model.addAttribute("isAuthenticated", isAuthenticated);
//        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//        return "/car/carAdd";
//    }
//
//    /*
//
//    * CREATE POST
//
//     */
//    @RequestMapping(value = "/create", method = RequestMethod.POST)
//    public String create(Model model,@ModelAttribute("CarForm")
//            CarForm carForm){
//        if(companyCarService.isUniqueNumber(carForm.getLicenseNumberPlates()) &&
//                companyCarService.isFullInput(carForm)){
//            Car newCar = new Car(carForm.getBrandCar(),carForm.getModelCar(),
//                    carForm.getTypeCar(), carForm.getYearCar());
//            CompanyCar newCompanyCar = new CompanyCar(newCar ,
//                    carForm.getCostCar(), carForm.getLicenseNumberPlates(),
//                    carForm.getRentalPrice());
//            companyCarService.create(newCompanyCar);
//            return "redirect:/CarRentals/car/list";
//        }
//        List typeCar = Arrays.asList( TypeCar.values());
//        model.addAttribute("typeCar", typeCar);
//        List yearCar = new ArrayList();
//        int nowYear = LocalDate.now().getYear();
//        for (Integer i = nowYear; i >= 2000; i--) {
//            yearCar.add(i.toString());
//        }
//        model.addAttribute("yearCar", yearCar);
//        String error = "";
//        if(companyCarService.isUniqueNumber(carForm.getLicenseNumberPlates())){
//            error = "Enter another license number plates!";
//        }
//        else {
//            error = "All fields must be filled!";
//        }
//        model.addAttribute("errorMessage", error);
//        return "/car/carAdd";
//    }
//
//    /*
//
//    * DELETE
//
//     */
//    @RequestMapping("/delete/{id}")
//    public String delete(Model model,@PathVariable(value = "id")String id){
//        companyCarService.delete(id);
//        return "redirect:/CarRentals/car/list";
//    }
//
//    /*
//
//    *UPDATE GET
//
//     */
//
//    // @PostMapping("/update/{id}")
//    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
//    public String updateCar(Model model,  @PathVariable("id") String id){
//        CompanyCar carToUpdate = companyCarService.get(id);
//        CarForm carForm = new CarForm();
//        carForm.setId(carToUpdate.getId());
//        carForm.setBrandCar(carToUpdate.getCar().getBrandCar());
//        carForm.setModelCar(carToUpdate.getCar().getModelCar());
//        carForm.setCostCar(carToUpdate.getCostCar());
//        carForm.setLicenseNumberPlates(carToUpdate.getLicenseNumberPlates());
//        carForm.setTypeCar(carToUpdate.getCar().getTypeCar());
//        carForm.setYearCar(carToUpdate.getCar().getYearCar());
//        carForm.setRentalPrice(carToUpdate.getRentalPrice());
//        List listRepair = new ArrayList();
//        if(carToUpdate.isRepair()){
//            listRepair.add("yes");
//            listRepair.add("no");
//        }
//        else{
//            listRepair.add("no");
//            listRepair.add("yes");
//        }
//        model.addAttribute("ListRepair", listRepair);
//        String rent;
//        if(carToUpdate.isRent()){
//            rent = "yes";
//        }
//        else{
//            rent = "no";
//        }
//        carForm.setRent(rent);
//        model.addAttribute("CarForm", carForm);
//
//        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        boolean isAuthenticated;
//        if(SecurityContextHolder.getContext().getAuthentication().getPrincipal() instanceof UserDetails) isAuthenticated = true;
//        else isAuthenticated = false;
//        if(isAuthenticated){
//            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//            LoginUser loginUser = (LoginUser) authentication.getPrincipal();
//            Person personLogin = personService.getPersonLoginUser(loginUser);
//            Customer customerLogin = customerService.getCustomerPerson(personLogin);
//            model.addAttribute("personLogin", customerLogin);
//        }
//        model.addAttribute("isAuthenticated", isAuthenticated);
//        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//        return "/car/carToUpdate";
//    }
//
//    /*
//
//    *UPDATE POST
//
//     */
//
//    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
//    public String update(@ModelAttribute("CarForm") CarForm carForm){
//        boolean repair, rent;
//        if(carForm.getRepair().equals("yes")){
//            repair = true;
//        }else{
//            repair = false;
//        }
//        if(carForm.getRent().equals("yes")){
//            rent = true;
//        }
//        else {
//            rent = false;
//        }
//
//        Car newCar = new Car(carForm.getBrandCar(), carForm.getModelCar(),
//                carForm.getTypeCar(), carForm.getYearCar());
//        newCar.setId(carForm.getId());
//
//        CompanyCar newCompanyCar = new CompanyCar(newCar,carForm.getCostCar(),
//                carForm.getLicenseNumberPlates(), carForm.getRentalPrice());
//        newCompanyCar.setId(carForm.getId());
//
//        rentCarService.companyCarUpdate(companyCarService.update(newCompanyCar));
//        return "redirect:/CarRentals/car/list";
//    }
//}
