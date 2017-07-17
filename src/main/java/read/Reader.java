package read;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entity.city.City;
import file.request.RequestFile;
import util.Constants;

public class Reader {

    private BufferedReader br;
    private String header;
    private List<City> datalist = new ArrayList<City>();
    private FileReader fr;

    public Reader() {
        try {
            RequestFile requestFile = new RequestFile(Constants.URL);
            if (requestFile.isDownloaded()) {
                this.fr = new FileReader(requestFile.getFile());
                this.br = new BufferedReader(this.fr);
                this.header = this.br.readLine();
            }
        } catch (IOException e1) {
            e1.printStackTrace();
        }

    }

    public List<City> getListCitys() {
        try {
            String stringRead = this.br.readLine();
            while (stringRead != null) {
                String st[] = stringRead.split(",");
                int pos = 0;
                City temp = new City(st[pos++], st[pos++], st[pos++], st[pos++], st[pos++], st[pos++], st[pos++],
                        st[pos++], st[pos++], st[pos++]);
                this.datalist.add(temp);
                stringRead = this.br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            this.close();
        }
        return this.datalist;
    }

    public String getHeader() {
        return this.header;
    }

    private void close() {
        try {
            this.br.close();
            this.fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
