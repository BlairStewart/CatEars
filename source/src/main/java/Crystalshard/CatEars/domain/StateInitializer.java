package crystalshard.catears.domain;

//import com.google.inject.Inject;

public class StateInitializer {

//    private CityRepository cityRepository;
//    private RadarSiteRepository radarSiteRepository;
//    private UserRepository userRepository;
//
//    @Inject
//    public StateInitializer(
//            CityRepository cityRepository,
//            RadarSiteRepository radarSiteRepository,
//            UserRepository userRepository) {
//        this.cityRepository = cityRepository;
//        this.radarSiteRepository = radarSiteRepository;
//        this.userRepository = userRepository;
//    }
//
//    public void init() {
//        CityId cityId = createCity();
//        createRadarSites(cityId);
//        createUsers();
//    }
//
//    private void createRadarSites(CityId cityId) {
//        radarSiteRepository.save(RadarSite.forRepoPersistance(cityId, new GlobalLocation(52.100426, -106.701137), "Gordie Howe Bridge", true));
//        radarSiteRepository.save(RadarSite.forRepoPersistance(cityId, new GlobalLocation(52.0971148, -106.6051855), "South Highway 16 East", false));
//        radarSiteRepository.save(RadarSite.forRepoPersistance(cityId, new GlobalLocation(52.089482, -106.634995), "Highway 11 South", false));
//        radarSiteRepository.save(RadarSite.forRepoPersistance(cityId, new GlobalLocation(52.140997, -106.611822), "North Highway 16 East", false));
//        radarSiteRepository.save(RadarSite.forRepoPersistance(cityId, new GlobalLocation(52.149088, -106.690233), "Circle Drive East", false));
//    }
//
//    private CityId createCity() {
//        City saskatoon = City.forRepoPersistance("Saskatoon", "Saskatoon, Sk", true);
//        return cityRepository.save(saskatoon).getCityId();
//    }
//
//    private void createUsers() {
//        User user = User.forRepoPersistance(
//                UserNameContext.of("Stewartb"),
//                PasswordHashContext.of("000"),
//                "000",
//                PasswordHashingMethodEnum.SHA1,
//                true
//        );
//        userRepository.save(user);
//    }
}
