package com.example.googlemap.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.googlemap.Models.Listener;
import com.example.googlemap.Models.Adapter;
import com.example.googlemap.Models.country;
import com.example.googlemap.databinding.ActivityRvBinding;
import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;

public class RVActivity extends AppCompatActivity implements Listener {
ActivityRvBinding binding;
Adapter adapter;
    ArrayList< ArrayList<country> > countries;
    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        binding = ActivityRvBinding.inflate( getLayoutInflater() );
        setContentView( binding.getRoot());

        countries = new ArrayList <>(  );

        adapter=new Adapter( Asia() ,RVActivity.this );
        binding.RVAsia.setAdapter( adapter );
        binding.RVAsia.setHasFixedSize( true );
        binding.RVAsia.setLayoutManager( new LinearLayoutManager
                ( this, RecyclerView.VERTICAL,false ) );


        adapter=new Adapter( Africa() ,RVActivity.this );
        binding.RVAfrica.setAdapter( adapter );
        binding.RVAfrica.setHasFixedSize( true );
        binding.RVAfrica.setLayoutManager( new LinearLayoutManager
                ( this, RecyclerView.VERTICAL,false ) );


        adapter=new Adapter( Europe() ,RVActivity.this );
        binding.RVEurope.setAdapter( adapter );
        binding.RVEurope.setHasFixedSize( true );
        binding.RVEurope.setLayoutManager( new LinearLayoutManager
                ( this, RecyclerView.VERTICAL,false ) );


        adapter=new Adapter( Australia() ,RVActivity.this );
        binding.RVAustralia.setAdapter( adapter );
        binding.RVAustralia.setHasFixedSize( true );
        binding.RVAustralia.setLayoutManager( new LinearLayoutManager
                ( this, RecyclerView.VERTICAL,false ) );


        adapter=new Adapter( North_American() ,RVActivity.this );
        binding.RVNorthAmerican.setAdapter( adapter );
        binding.RVNorthAmerican.setHasFixedSize( true );
        binding.RVNorthAmerican.setLayoutManager( new LinearLayoutManager
                ( this, RecyclerView.VERTICAL,false ) );


        adapter=new Adapter( South_America() ,RVActivity.this );
        binding.RVSouthAmerica.setAdapter( adapter );
        binding.RVSouthAmerica.setHasFixedSize( true );
        binding.RVSouthAmerica.setLayoutManager( new LinearLayoutManager
                ( this, RecyclerView.VERTICAL,false ) );

        countries.add( Asia() );
        countries.add( Africa() );
        countries.add( Europe() );
        countries.add( Australia() );
        countries.add( North_American() );
        countries.add(South_America() );

    }
    public ArrayList< country > Asia(){
        ArrayList< country > countries;
        countries = new ArrayList <>(  );
        // Afghanistan
        countries.add(new country(new LatLng(34.5553, 69.2075), "Kabul - Afghanistan"));

// Armenia
        countries.add(new country(new LatLng(40.1872, 44.5152), "Yerevan - Armenia"));

// Azerbaijan
        countries.add(new country(new LatLng(40.4093, 49.8671), "Baku - Azerbaijan"));

// Bahrain
        countries.add(new country(new LatLng(26.2285, 50.5860), "Manama - Bahrain"));

// Bangladesh
        countries.add(new country(new LatLng(23.8103, 90.4125), "Dhaka - Bangladesh"));

// Bhutan
        countries.add(new country(new LatLng(27.4728, 89.6390), "Thimphu - Bhutan"));

// Brunei
        countries.add(new country(new LatLng(4.9031, 114.9398), "Bandar Seri Begawan - Brunei"));

// Cambodia
        countries.add(new country(new LatLng(11.5564, 104.9282), "Phnom Penh - Cambodia"));

// China
        countries.add(new country(new LatLng(39.9042, 116.4074), "Beijing - China"));

// Cyprus
        countries.add(new country(new LatLng(35.1856, 33.3823), "Nicosia - Cyprus"));

// Georgia
        countries.add(new country(new LatLng(41.7151, 44.8271), "Tbilisi - Georgia"));

// India
        countries.add(new country(new LatLng(28.6139, 77.2090), "New Delhi - India"));

// Indonesia
        countries.add(new country(new LatLng(-6.2088, 106.8456), "Jakarta - Indonesia"));

// Iran
        countries.add(new country(new LatLng(35.6892, 51.3890), "Tehran - Iran"));

// Iraq
        countries.add(new country(new LatLng(33.3128, 44.3615), "Baghdad - Iraq"));

// Israel
        countries.add(new country(new LatLng(31.7683, 35.2137), "Jerusalem - Israel"));

// Japan
        countries.add(new country(new LatLng(35.6762, 139.6503), "Tokyo - Japan"));

// Jordan
        countries.add(new country(new LatLng(31.9454, 35.9284), "Amman - Jordan"));

// Kazakhstan
        countries.add(new country(new LatLng(51.1605, 71.4704), "Nur-Sultan - Kazakhstan"));

// Kuwait
        countries.add(new country(new LatLng(29.3759, 47.9774), "Kuwait City - Kuwait"));

// Kyrgyzstan
        countries.add(new country(new LatLng(42.8746, 74.5698), "Bishkek - Kyrgyzstan"));

// Laos
        countries.add(new country(new LatLng(17.9757, 102.6331), "Vientiane - Laos"));

// Lebanon
        countries.add(new country(new LatLng(33.8938, 35.5018), "Beirut - Lebanon"));

// Malaysia
        countries.add(new country(new LatLng(3.1390, 101.6869), "Kuala Lumpur - Malaysia"));

// Maldives
        countries.add(new country(new LatLng(4.1755, 73.5093), "Malé - Maldives"));

// Mongolia
        countries.add(new country(new LatLng(47.9212, 106.9186), "Ulaanbaatar - Mongolia"));
// Myanmar
        countries.add(new country(new LatLng(16.8409, 96.1735), "Naypyidaw - Myanmar"));

// Nepal
        countries.add(new country(new LatLng(27.7172, 85.3240), "Kathmandu - Nepal"));

// North Korea
        countries.add(new country(new LatLng(39.0392, 125.7625), "Pyongyang - North Korea"));

// Oman
        countries.add(new country(new LatLng(23.6142, 58.5922), "Muscat - Oman"));

// Pakistan
        countries.add(new country(new LatLng(33.7294, 73.0931), "Islamabad - Pakistan"));

// Palestine
        countries.add(new country(new LatLng(31.7767, 35.2345), "Ramallah - Palestine"));

// Philippines
        countries.add(new country(new LatLng(14.5995, 120.9842), "Manila - Philippines"));

// Qatar
        countries.add(new country(new LatLng(25.2854, 51.5310), "Doha - Qatar"));

// Russia
        countries.add(new country(new LatLng(55.7558, 37.6173), "Moscow - Russia"));

// Saudi Arabia
        countries.add(new country(new LatLng(24.7136, 46.6753), "Riyadh - Saudi Arabia"));

// Singapore
        countries.add(new country(new LatLng(1.3521, 103.8198), "Singapore - Singapore"));

// South Korea
        countries.add(new country(new LatLng(37.5665, 126.9780), "Seoul - South Korea"));

// Sri Lanka
        countries.add(new country(new LatLng(6.9271, 79.8612), "Sri Jayawardenepura Kotte - Sri Lanka"));

// Syria
        countries.add(new country(new LatLng(33.5138, 36.2765), "Damascus - Syria"));

// Taiwan
        countries.add(new country(new LatLng(25.0328, 121.5654), "Taipei - Taiwan"));

// Tajikistan
        countries.add(new country(new LatLng(38.5800, 68.7870), "Dushanbe - Tajikistan"));

// Thailand
        countries.add(new country(new LatLng(13.7563, 100.5018), "Bangkok - Thailand"));

// Timor-Leste (East Timor)
        countries.add(new country(new LatLng(-8.5569, 125.5603), "Dili - Timor-Leste"));

// Turkey
        countries.add(new country(new LatLng(39.9334, 32.8597), "Ankara - Turkey"));

// Turkmenistan
        countries.add(new country(new LatLng(37.9601, 58.3261), "Ashgabat - Turkmenistan"));

// United Arab Emirates
        countries.add(new country(new LatLng(24.4539, 54.3773), "Abu Dhabi - United Arab Emirates"));

// Uzbekistan
        countries.add(new country(new LatLng(41.2995, 69.2401), "Tashkent - Uzbekistan"));

// Vietnam
        countries.add(new country(new LatLng(21.0278, 105.8342), "Hanoi - Vietnam"));

// Yemen
        countries.add(new country(new LatLng(15.3694, 44.1910), "Sana'a - Yemen"));

return countries;
    }
    public ArrayList< country > Europe(){
        ArrayList< country > countries;
        countries = new ArrayList <>(  );
        // Albania
        countries.add(new country(new LatLng(41.3275, 19.8187), "Tirana - Albania"));

// Andorra
        countries.add(new country(new LatLng(42.5063, 1.5218), "Andorra la Vella - Andorra"));

// Austria
        countries.add(new country(new LatLng(48.2082, 16.3738), "Vienna - Austria"));

// Belarus
        countries.add(new country(new LatLng(53.9045, 27.5615), "Minsk - Belarus"));

// Belgium
        countries.add(new country(new LatLng(50.8503, 4.3517), "Brussels - Belgium"));

// Bosnia and Herzegovina
        countries.add(new country(new LatLng(43.9159, 17.6791), "Sarajevo - Bosnia and Herzegovina"));

// Bulgaria
        countries.add(new country(new LatLng(42.6977, 23.3219), "Sofia - Bulgaria"));

// Croatia
        countries.add(new country(new LatLng(45.8150, 15.9819), "Zagreb - Croatia"));

// Cyprus
        countries.add(new country(new LatLng(35.1856, 33.3823), "Nicosia - Cyprus"));

// Czech Republic
        countries.add(new country(new LatLng(50.0755, 14.4378), "Prague - Czech Republic"));

// Denmark
        countries.add(new country(new LatLng(55.6761, 12.5683), "Copenhagen - Denmark"));

// Estonia
        countries.add(new country(new LatLng(59.4370, 24.7536), "Tallinn - Estonia"));

// Finland
        countries.add(new country(new LatLng(60.1699, 24.9384), "Helsinki - Finland"));

// France
        countries.add(new country(new LatLng(48.8566, 2.3522), "Paris - France"));

// Germany
        countries.add(new country(new LatLng(52.5200, 13.4050), "Berlin - Germany"));

// Greece
        countries.add(new country(new LatLng(37.9838, 23.7275), "Athens - Greece"));

// Hungary
        countries.add(new country(new LatLng(47.4979, 19.0402), "Budapest - Hungary"));

// Iceland
        countries.add(new country(new LatLng(64.1466, -21.9426), "Reykjavik - Iceland"));

// Ireland
        countries.add(new country(new LatLng(53.3498, -6.2603), "Dublin - Ireland"));

// Italy
        countries.add(new country(new LatLng(41.9028, 12.4964), "Rome - Italy"));

// Kosovo
        countries.add(new country(new LatLng(42.6629, 21.1655), "Pristina - Kosovo"));

// Latvia
        countries.add(new country(new LatLng(56.9496, 24.1052), "Riga - Latvia"));

// Liechtenstein
        countries.add(new country(new LatLng(47.1410, 9.5215), "Vaduz - Liechtenstein"));

// Lithuania
        countries.add(new country(new LatLng(54.6872, 25.2797), "Vilnius - Lithuania"));

// Luxembourg
        countries.add(new country(new LatLng(49.6116, 6.1319), "Luxembourg - Luxembourg"));

// Malta
        countries.add(new country(new LatLng(35.8989, 14.5146), "Valletta - Malta"));

// Moldova

        countries.add(new country(new LatLng(47.0269, 28.8416), "Chișinău - Moldova"));


        // Monaco
        countries.add(new country(new LatLng(43.7325, 7.4189), "Monaco - Monaco"));

// Montenegro
        countries.add(new country(new LatLng(42.4304, 19.2594), "Podgorica - Montenegro"));

// Netherlands
        countries.add(new country(new LatLng(52.3702, 4.8952), "Amsterdam - Netherlands"));

// North Macedonia
        countries.add(new country(new LatLng(41.9973, 21.4280), "Skopje - North Macedonia"));

// Norway
        countries.add(new country(new LatLng(59.9139, 10.7522), "Oslo - Norway"));

// Poland
        countries.add(new country(new LatLng(52.2297, 21.0122), "Warsaw - Poland"));

// Portugal
        countries.add(new country(new LatLng(38.7223, -9.1393), "Lisbon - Portugal"));

// Romania
        countries.add(new country(new LatLng(44.4268, 26.1025), "Bucharest - Romania"));

// Russia
        countries.add(new country(new LatLng(55.7558, 37.6173), "Moscow - Russia"));

// San Marino
        countries.add(new country(new LatLng(43.9424, 12.4578), "San Marino - San Marino"));

// Serbia
        countries.add(new country(new LatLng(44.7872, 20.4573), "Belgrade - Serbia"));

// Slovakia
        countries.add(new country(new LatLng(48.1486, 17.1077), "Bratislava - Slovakia"));

// Slovenia
        countries.add(new country(new LatLng(46.0569, 14.5058), "Ljubljana - Slovenia"));

// Spain
        countries.add(new country(new LatLng(40.4168, -3.7038), "Madrid - Spain"));

// Sweden
        countries.add(new country(new LatLng(59.3293, 18.0686), "Stockholm - Sweden"));

// Switzerland
        countries.add(new country(new LatLng(46.2044, 6.1432), "Bern - Switzerland"));

// Ukraine
        countries.add(new country(new LatLng(50.4501, 30.5234), "Kyiv - Ukraine"));

// United Kingdom
        countries.add(new country(new LatLng(51.5074, -0.1278), "London - United Kingdom"));
        return countries;
    }
    public ArrayList< country > Australia(){
        ArrayList< country > countries;
        countries = new ArrayList <>(  );
        countries.add(new country(new LatLng(-35.282, 149.1287), "Australia-Canberra"));
        countries.add(new country(new LatLng(-33.8688, 151.2093), "Australia-Sydney"));
        countries.add(new country(new LatLng(-37.8136, 144.9631), "Australia-Melbourne"));
        countries.add(new country(new LatLng(-27.471, 153.0235), "Australia-Brisbane"));
        countries.add(new country(new LatLng(-31.9536, 115.8579), "Australia-Perth"));
        countries.add(new country(new LatLng(-34.9285, 138.6007), "Australia-Adelaide"));
        countries.add(new country(new LatLng(-12.4628, 130.8417), "Australia-Darwin"));
        countries.add(new country(new LatLng(-35.2829, 149.1312), "Australia-Canberra"));
        countries.add(new country(new LatLng(-35.3075, 149.1244), "Australia-Canberra"));
        countries.add(new country(new LatLng(-35.2828, 149.1312), "Australia-Canberra"));
        countries.add(new country(new LatLng(-34.9273, 138.6003), "Australia-Adelaide"));
        return countries;
    }
    public ArrayList< country > South_America(){
        ArrayList< country > countries;
        countries = new ArrayList <>(  );
        countries.add( new country(new LatLng( -15.7942, -47.8822 ),"Brazil-Brasilia") );
        countries.add( new country(new LatLng( -34.6037, -58.3816 ),"Argentina-Buenos Aires") );
        countries.add( new country(new LatLng( -33.4691, -70.6418 ),"Chile-Santiago") );
        countries.add( new country(new LatLng( 4.7109, -74.0721 ),"Colombia-Bogota") );
        countries.add( new country(new LatLng( -0.1807, -78.4678 ),"Ecuador-Quito") );
        countries.add( new country(new LatLng( 3.4529, -76.5320 ),"Peru-Lima") );
        countries.add( new country(new LatLng( -23.5505, -46.6333 ),"Brazil-Sao Paulo") );
        countries.add( new country(new LatLng( 10.4806, -66.9036 ),"Venezuela-Caracas") );
        countries.add( new country(new LatLng( -12.0464, -77.0428 ),"Peru-Lima") );
        countries.add( new country(new LatLng( -34.9011, -56.1645 ),"Uruguay-Montevideo") );
        countries.add( new country(new LatLng( -25.4284, -49.2733 ),"Brazil-Curitiba") );
        countries.add( new country(new LatLng( -12.0464, -77.0428 ),"Peru-Lima") );
        countries.add( new country(new LatLng( -23.5505, -46.6333 ),"Brazil-Sao Paulo") );
        countries.add( new country(new LatLng( -25.5941, -54.5730 ),"Paraguay-Asuncion") );
        countries.add( new country(new LatLng( -33.4489, -70.6693 ),"Chile-Santiago") );
        countries.add( new country(new LatLng( -34.6037, -58.3816 ),"Argentina-Buenos Aires") );
        countries.add( new country(new LatLng( 2.4415, -76.6066 ),"Colombia-Cali") );
        countries.add( new country(new LatLng( -27.5949, -48.5482 ),"Brazil-Florianopolis") );
        countries.add( new country(new LatLng( -8.0543, -34.8813 ),"Brazil-Recife") );
        countries.add( new country(new LatLng( 10.6596, -71.6533 ),"Venezuela-Maracaibo") );
        countries.add( new country(new LatLng( -22.9068, -43.1729 ),"Brazil-Rio de Janeiro") );
        countries.add( new country(new LatLng( -33.0472, -71.6127 ),"Chile-Valparaiso") );
        countries.add( new country(new LatLng( -12.0464, -77.0428 ),"Peru-Lima") );
        return countries;
    }
    public ArrayList< country > North_American(){
        ArrayList< country > countries;
        countries = new ArrayList <>(  );
        countries.add( new country(new LatLng( 45.4215, -75.6972 ),"Canada-Ottawa") );
        countries.add( new country(new LatLng( 19.4326, -99.1332 ),"Mexico-Mexico City") );
        countries.add( new country(new LatLng( 38.9072, -77.0369 ),"USA-Washington D.C.") );
        countries.add( new country(new LatLng( 14.6349, -90.5069 ),"Guatemala-Guatemala City") );
        countries.add( new country(new LatLng( 15.7835, -90.2308 ),"Honduras-Tegucigalpa") );
        countries.add( new country(new LatLng( 13.6929, -89.2182 ),"El Salvador-San Salvador") );
        countries.add( new country(new LatLng( 9.7489, -83.7534 ),"Costa Rica-San Jose") );
        countries.add( new country(new LatLng( 8.9943, -79.5188 ),"Panama-Panama City") );
        countries.add( new country(new LatLng( 18.4861, -66.1196 ),"Puerto Rico-San Juan") );
        return countries;
    }
    public ArrayList< country >  Africa(){
        ArrayList< country > countries;
        countries = new ArrayList <>(  );
        countries.add(new country(new LatLng(33.93911,67.709953),"Afghanistan-Kabul"));
        countries.add(new country(new LatLng(41.327546,19.818698),"Albania-Tirana"));
        countries.add(new country(new LatLng(28.033886,1.659626),"Algeria-Algiers"));
        countries.add(new country(new LatLng(-14.270972, -170.132217),"American Samoa-Pago Pago"));
        countries.add(new country(new LatLng(-35.675147,-71.542969),"Argentina-Buenos Aires"));
        countries.add(new country(new LatLng(40.069099,-82.426879),"Armenia-Yerevan"));
        countries.add(new country(new LatLng(47.516231,14.550072),"Austria-Vienna"));
        countries.add(new country(new LatLng(25.03428,-77.39628),"Bahamas-Nassau"));
        countries.add(new country(new LatLng(26.0667,50.5577),"Bahrain-Manama"));
        countries.add(new country(new LatLng(24.2155, -12.8858),"Western Sahara-El-Aaiun"));
        countries.add(new country(new LatLng(24.2155,-12.8858),"Western Sahara-El-Aaiun"));
        countries.add(new country(new LatLng(24.2155, -12.8858),"Western Sahara-El-Aaiun"));
        countries.add(new country(new LatLng(23.684994,-102.552784),"Mexico-Mexico City"));
        countries.add(new country(new LatLng(9.30769,2.315834),"Niger-Niamey"));
        countries.add(new country(new LatLng(9.081999,8.675277),"Nigeria-Abuja"));
        countries.add(new country(new LatLng(64.963051,-19.020835),"Iceland-Reykjavik"));
        countries.add(new country(new LatLng(31.046051,34.851612),"Israel-Jerusalem"));
        countries.add(new country(new LatLng(60.128161,18.643501),"Sweden-Stockholm"));
        countries.add(new country(new LatLng(56.26392,9.501785),"Denmark-Copenhagen"));
        countries.add(new country(new LatLng(-1.831239, -78.183406),"Ecuador-Quito"));
        countries.add(new country(new LatLng(59.437,24.7536),"Estonia-Tallinn"));
        countries.add(new country(new LatLng(11.825138, 42.590275),"Ethiopia-Addis Ababa"));
        countries.add(new country(new LatLng(-17.558417, -149.573147),"French Polynesia-Papeete"));
        countries.add(new country(new LatLng(-51.796253,-59.523613),"Falkland Islands-Stanley"));
        countries.add(new country(new LatLng(61.92411,25.748151),"Finland-Helsinki"));
        countries.add(new country(new LatLng(-20.348404,57.552152),"Mauritius-Port Louis"));
        countries.add(new country(new LatLng(-0.803689,11.609444),"Gabon-Libreville"));
        countries.add(new country(new LatLng(13.443182,-15.310139),"Gambia-Banjul"));
        countries.add(new country(new LatLng(42.315407,43.356892),"Georgia-Tbilisi"));
        countries.add(new country(new LatLng(49.817492,15.472962),"Czech Republic-Prague"));
        countries.add(new country(new LatLng(51.165691,10.451526),"Germany-Berlin"));
        countries.add(new country(new LatLng(12.1364, -1.1946), "Burkina Faso-Ouagadougou"));
        countries.add(new country(new LatLng(9.0574, 7.4898), "Nigeria-Abuja"));
        countries.add(new country(new LatLng(-12.0931, -77.0465), "Peru-Lima"));
        countries.add(new country(new LatLng(12.1165, -61.6790), "Grenada-St. George's"));
        countries.add(new country(new LatLng(11.5802, 43.1428), "Somalia-Mogadishu"));
        countries.add(new country(new LatLng(-6.1748, 35.7380), "Tanzania-Dodoma"));
        countries.add(new country(new LatLng(15.5007, -88.0284), "Belize-Belmopan"));
        countries.add(new country(new LatLng(-8.8290, 13.2450), "Angola-Luanda"));
        countries.add(new country(new LatLng(13.1562, -59.5250), "Barbados-Bridgetown"));
        countries.add(new country(new LatLng(-22.3285, 24.6849), "Botswana-Gaborone"));
        countries.add(new country(new LatLng(5.8390, -55.2038), "Suriname-Paramaribo"));
        countries.add(new country(new LatLng(-25.7461, 28.1881), "South Africa-Pretoria"));
        countries.add(new country(new LatLng(-23.5505, -46.6333), "Brazil-Brasília"));
        countries.add(new country(new LatLng(6.9271, 79.8612), "Sri Lanka-Sri Jayawardenepura Kotte"));
        countries.add(new country(new LatLng(10.8231, 106.6297), "Vietnam-Ho Chi Minh City"));
        countries.add(new country(new LatLng(-15.4167, 28.2833), "Zambia-Lusaka"));
        countries.add(new country(new LatLng(9.0054, 38.7636), "Ethiopia-Addis Ababa"));
        countries.add(new country(new LatLng(-17.8252, 31.0335), "Zimbabwe-Harare"));
        countries.add(new country(new LatLng(15.7835, -90.2308), "Guatemala-Guatemala City"));
        countries.add(new country(new LatLng(-13.9626, 33.7741), "Malawi-Lilongwe"));
        countries.add(new country(new LatLng(18.0027, -76.7936), "Jamaica-Kingston"));
        countries.add(new country(new LatLng(17.9710, -76.7920), "Cuba-Havana"));
        countries.add(new country(new LatLng(18.4930, -69.8578), "Dominican Republic-Santo Domingo"));
        countries.add(new country(new LatLng(9.3077, 2.3158), "Togo-Lomé"));
        countries.add(new country(new LatLng(12.1000, -68.9167), "Curacao-Willemstad"));
        countries.add(new country(new LatLng(9.0054, 38.7636), "Ethiopia-Addis Ababa"));
        countries.add(new country(new LatLng(-25.7461, 28.1875), "South Africa-Pretoria"));
        countries.add(new country(new LatLng(36.7525, 3.04197), "Algeria-Algiers"));
        countries.add(new country(new LatLng(12.65, -8.0), "Mali-Bamako"));
        countries.add(new country(new LatLng(-8.815, 13.231), "Angola-Luanda"));
        countries.add(new country(new LatLng(12.3723, -1.5247), "Burkina Faso-Ouagadougou"));
        countries.add(new country(new LatLng(4.8517, 31.5825), "South Sudan-Juba"));
        countries.add(new country(new LatLng(9.5375, -13.6781), "Sierra Leone-Freetown"));
        countries.add(new country(new LatLng(11.8251, 42.5903), "Djibouti-Djibouti"));
        countries.add(new country(new LatLng(11.8636, -15.5977), "The Gambia-Banjul"));
        countries.add(new country(new LatLng(1.2921, 36.8219), "Kenya-Nairobi"));
        countries.add(new country(new LatLng(6.4654, 3.4068), "Nigeria-Abuja"));
        countries.add(new country(new LatLng(18.075, -15.9785), "Western Sahara-El Aaiún"));
        countries.add(new country(new LatLng(14.7331, -17.49), "Senegal-Dakar"));
        countries.add(new country(new LatLng(32.5599, 35.8575), "Palestine-Ramallah"));
        countries.add(new country(new LatLng(33.8869, 9.5375), "Tunisia-Tunis"));
        countries.add(new country(new LatLng(10.823, 106.6297), "Tanzania-Dodoma"));
        countries.add(new country(new LatLng(6.335, -10.807), "Liberia-Monrovia"));
        countries.add(new country(new LatLng(33.9716, -6.8498), "Morocco-Rabat"));
        countries.add(new country(new LatLng(15.2663, 44.1989), "Yemen-Sana'a"));
        countries.add(new country(new LatLng(-25.7461, 28.1875), "South Africa-Cape Town"));
        countries.add(new country(new LatLng(15.3033, -61.3877), "Dominica-Roseau"));
        countries.add(new country(new LatLng(9.4546, -0.8518), "Togo-Lomé"));
        countries.add(new country(new LatLng(11.849, -15.584), "Guinea-Conakry"));
        countries.add(new country(new LatLng(18.105, -15.9477), "Mauritania-Nouakchott"));
        countries.add(new country(new LatLng(17.9647, -76.7942), "Jamaica-Kingston"));
        countries.add(new country(new LatLng(-6.1648, 39.2026), "Tanzania-Dodoma"));
        countries.add(new country(new LatLng(9.0574, 7.4898), "Nigeria-Abuja"));
        countries.add(new country(new LatLng(12.1364, -1.1946), "Burkina Faso-Ouagadougou"));
        return countries;

    }


    @Override
    public void show( int pos ) {
        Intent intent=new Intent( RVActivity.this, MapsActivity.class );
        double latitude= Asia().get( pos ).id.latitude;
        double longitude= Asia().get( pos ).id.longitude;
        intent.putExtra( "latitude",latitude );
        intent.putExtra( "longitude",longitude );
        startActivity( intent );
        Log.d( "Mainpos", latitude+"/" + longitude);

    }
}