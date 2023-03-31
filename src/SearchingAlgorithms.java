//  Implementation of all searching algorithms: Find Airport Code
public class SearchingAlgorithms {

    public static String linearSearch(String toFind, Airport[] airports) {
        int index = 0;
        while (index < airports.length) {
            Airport current = airports[index];
            if (toFind.equals(current.getCity())) {
                return current.getCode();
            }
            index++;
        }
        return null;
    }

    public static String binarySearch(String toFind, Airport[] airports) {
        int low = 0;
        int high = airports.length;
        int mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            int compare = toFind.compareTo(airports[mid].getCity());
            if (compare < 0) {
                high = mid - 1;
            } else if (compare > 0) {
                low = mid + 1;
            } else {
                return airports[mid].getCode();
            }
        }
        return null;
    }

    private static class Airport implements Comparable<Airport> {

        private String city;
        private String country;
        private String code;

        public String getCity() {
            return city;
        }

        public String getCountry() {
            return country;
        }

        public String getCode() {
            return code;
        }

        @Override
        public int compareTo(Airport o) {
            return this.getCity().compareTo(o.getCity());
        }
    }
}
