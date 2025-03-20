import java.net.*;  
import java.util.Scanner;


class DomainExtractor {
    private String url;

    
    public DomainExtractor(String url) {
        this.url = url;
    }

    
    public String getDomain() {
        try {
            java.net.URL urlObj = new java.net.URL(url);  
            String host = urlObj.getHost();

            
            if (host.startsWith("www.")) {
                host = host.substring(4);
            }
            return host;
        } catch (MalformedURLException e) {
            return "Invalid URL";
        }
    }
}


class URL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter URL: ");
        String url = sc.nextLine();

        
        DomainExtractor ob = new DomainExtractor(url);

        
        System.out.println("Domain: " + ob.getDomain());

        sc.close();
    }
}
