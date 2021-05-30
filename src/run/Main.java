package run;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import dao.CrawlerDAO;
import model.CrawlerModel;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		CrawlerDAO crawlerDAO = new CrawlerDAO();
		CrawlerModel crawler = new CrawlerModel();
        new Thread(crawlingNorte).start();
        new Thread(crawlingCentroOeste).start();
        new Thread(crawlingNordeste).start();
        new Thread(crawlingSudeste).start();
        new Thread(crawlingSul).start();		
	}
	

    public static Runnable crawlingNorte = new Runnable(){
        public void run(){
        	CrawlerDAO crawlerDAO = new CrawlerDAO();
            System.out.println("Thread Norte iniciada");
            String siglaEstadosNorte[] = {"RR", "AP", "AM", "PA", "AC", "RO", "TO"};
            Document doc;
            
            try {
              for(int i = 0; i < siglaEstadosNorte.length; i++){
              doc = Jsoup.connect("https://brasil.io/covid19/" + siglaEstadosNorte[i] + "/").timeout(6000).get();
              Elements tabela = doc.select("tbody");
              List<CrawlerModel> listCrawler = new ArrayList<>();
        
              for (Element e : tabela.select("tr")) {
            	  CrawlerModel crawlerData = new CrawlerModel();


                String data = e.select("td").attr("data-search");
                crawlerData.setData(data);
      
                String cidade = e.select("td:nth-child(2)").text();
                crawlerData.setCidade(cidade);
      
                String confirmado = e.select("td:nth-child(3)").text();
                crawlerData.setConfirmado(confirmado);
      
                String confirmado100k = e.select("td:nth-child(4)").text();
                crawlerData.setConfirmado100k(confirmado100k);
      
                String obito = e.select("td:nth-child(5)").text();
                crawlerData.setObito(obito);
      
                String letalidade = e.select("td:nth-child(6)").text();
                crawlerData.setLetalitade(letalidade);
      
                String obito100k = e.select("td:nth-child(7)").text();
                crawlerData.setObito100k(obito100k);
      
                crawlerData.setEstado(siglaEstadosNorte[i]);
                crawlerDAO.create(crawlerData);
                listCrawler.add(crawlerData);
              }
              System.out.println("Crawling dos dados da COVID do estado " + siglaEstadosNorte[i] + " finalizado, " + listCrawler.size() + " adicionadas.");
            }
            System.out.println("Thread Norte finalizada");
            } catch (IOException | ClassNotFoundException e1) {
            e1.printStackTrace();
          }
        }
      };

      public static Runnable crawlingCentroOeste = new Runnable(){
        public void run(){
        	CrawlerDAO crawlerDAO = new CrawlerDAO();
            System.out.println("Thread Centro-Oeste iniciada");
            String siglaEstadosCentroOeste[] = {"MT", "GO", "MS", "DF"};
            Document doc;
            try {
              for(int i = 0; i < siglaEstadosCentroOeste.length; i++){
              doc = Jsoup.connect("https://brasil.io/covid19/" + siglaEstadosCentroOeste[i] + "/").timeout(6000).get();
              Elements tabela = doc.select("tbody");
              List<CrawlerModel> listCrawler = new ArrayList<>();
        
              for (Element e : tabela.select("tr")) {
                  final CrawlerModel crawlerData = new CrawlerModel();
                  String data = e.select("td").attr("data-search");
                  crawlerData.setData(data);
        
                  String cidade = e.select("td:nth-child(2)").text();
                  crawlerData.setCidade(cidade);
        
                  String confirmado = e.select("td:nth-child(3)").text();
                  crawlerData.setConfirmado(confirmado);
        
                  String confirmado100k = e.select("td:nth-child(4)").text();
                  crawlerData.setConfirmado100k(confirmado100k);
        
                  String obito = e.select("td:nth-child(5)").text();
                  crawlerData.setObito(obito);
        
                  String letalidade = e.select("td:nth-child(6)").text();
                  crawlerData.setLetalitade(letalidade);
        
                  String obito100k = e.select("td:nth-child(7)").text();
                  crawlerData.setObito100k(obito100k);
        
                  crawlerData.setEstado(siglaEstadosCentroOeste[i]);
        
                  crawlerDAO.create(crawlerData);
                  listCrawler.add(crawlerData);
                }
              System.out.println("Crawling dos dados da COVID do estado " + siglaEstadosCentroOeste[i] + " finalizado, " + listCrawler.size() + " adicionadas.");
            }
            System.out.println("Thread Centro-Oeste finalizada");
            } catch (IOException | ClassNotFoundException e1) {
            e1.printStackTrace();
          }
        }
      };

      public static Runnable crawlingNordeste = new Runnable(){
        public void run(){
        	CrawlerDAO crawlerDAO = new CrawlerDAO();
            System.out.println("Thread Nordeste iniciada");
            String siglaEstadosNordeste[] = {"MA", "PI", "CE", "RN", "PB", "PE", "AL", "SE", "BA"};
            Document doc;
            try {
              for(int i = 0; i < siglaEstadosNordeste.length; i++){
              doc = Jsoup.connect("https://brasil.io/covid19/" + siglaEstadosNordeste[i] + "/").timeout(6000).get();
              Elements tabela = doc.select("tbody");
              List<CrawlerModel> listCrawler = new ArrayList<>();
        
              for (Element e : tabela.select("tr")) {
                  final CrawlerModel crawlerData = new CrawlerModel();
                  String data = e.select("td").attr("data-search");
                  crawlerData.setData(data);
        
                  String cidade = e.select("td:nth-child(2)").text();
                  crawlerData.setCidade(cidade);
        
                  String confirmado = e.select("td:nth-child(3)").text();
                  crawlerData.setConfirmado(confirmado);
        
                  String confirmado100k = e.select("td:nth-child(4)").text();
                  crawlerData.setConfirmado100k(confirmado100k);
        
                  String obito = e.select("td:nth-child(5)").text();
                  crawlerData.setObito(obito);
        
                  String letalidade = e.select("td:nth-child(6)").text();
                  crawlerData.setLetalitade(letalidade);
        
                  String obito100k = e.select("td:nth-child(7)").text();
                  crawlerData.setObito100k(obito100k);
        
                  crawlerData.setEstado(siglaEstadosNordeste[i]);
        
                  crawlerDAO.create(crawlerData);
                  listCrawler.add(crawlerData);
                }
              System.out.println("Crawling dos dados da COVID do estado " + siglaEstadosNordeste[i] + " finalizado, " + listCrawler.size() + " adicionadas.");
            }
            System.out.println("Thread Nordeste finalizada");
            } catch (IOException | ClassNotFoundException e1) {
            e1.printStackTrace();
          }
        }
      };

      public static Runnable crawlingSudeste = new Runnable(){
        public void run(){
        	CrawlerDAO crawlerDAO = new CrawlerDAO();
            System.out.println("Thread Sudeste iniciada");
            String siglaEstadosSudeste[] = {"MG", "SP", "ES", "RJ"};
            Document doc;
            try {
              for(int i = 0; i < siglaEstadosSudeste.length; i++){
              doc = Jsoup.connect("https://brasil.io/covid19/" + siglaEstadosSudeste[i] + "/").timeout(6000).get();
              Elements tabela = doc.select("tbody");
              List<CrawlerModel> listCrawler = new ArrayList<>();
        
              for (Element e : tabela.select("tr")) {
                  final CrawlerModel crawlerData = new CrawlerModel();
                  String data = e.select("td").attr("data-search");
                  crawlerData.setData(data);
        
                  String cidade = e.select("td:nth-child(2)").text();
                  crawlerData.setCidade(cidade);
        
                  String confirmado = e.select("td:nth-child(3)").text();
                  crawlerData.setConfirmado(confirmado);
        
                  String confirmado100k = e.select("td:nth-child(4)").text();
                  crawlerData.setConfirmado100k(confirmado100k);
        
                  String obito = e.select("td:nth-child(5)").text();
                  crawlerData.setObito(obito);
        
                  String letalidade = e.select("td:nth-child(6)").text();
                  crawlerData.setLetalitade(letalidade);
        
                  String obito100k = e.select("td:nth-child(7)").text();
                  crawlerData.setObito100k(obito100k);
        
                  crawlerData.setEstado(siglaEstadosSudeste[i]);
        
                  crawlerDAO.create(crawlerData);
                  listCrawler.add(crawlerData);
                }
              System.out.println("Crawling dos dados da COVID do estado " + siglaEstadosSudeste[i] + " finalizado, " + listCrawler.size() + " adicionadas.");
            }
            System.out.println("Thread Sudeste finalizada");
            } catch (IOException | ClassNotFoundException e1) {
            e1.printStackTrace();
          }
        }
      };

      public static Runnable crawlingSul = new Runnable(){
        public void run() {
        	CrawlerDAO crawlerDAO = new CrawlerDAO();
            System.out.println("Thread Sul iniciada");
            String siglaEstadosSul[] = {"PR", "SC", "RS"};
            Document doc;
            try {
              for(int i = 0; i < siglaEstadosSul.length; i++){
              doc = Jsoup.connect("https://brasil.io/covid19/" + siglaEstadosSul[i] + "/").timeout(6000).get();
              Elements tabela = doc.select("tbody");
              List<CrawlerModel> listCrawler = new ArrayList<>();
        
              for (Element e : tabela.select("tr")) {
                  final CrawlerModel crawlerData = new CrawlerModel();
                  String data = e.select("td").attr("data-search");
                  crawlerData.setData(data);
        
                  String cidade = e.select("td:nth-child(2)").text();
                  crawlerData.setCidade(cidade);
        
                  String confirmado = e.select("td:nth-child(3)").text();
                  crawlerData.setConfirmado(confirmado);
        
                  String confirmado100k = e.select("td:nth-child(4)").text();
                  crawlerData.setConfirmado100k(confirmado100k);
        
                  String obito = e.select("td:nth-child(5)").text();
                  crawlerData.setObito(obito);
        
                  String letalidade = e.select("td:nth-child(6)").text();
                  crawlerData.setLetalitade(letalidade);
        
                  String obito100k = e.select("td:nth-child(7)").text();
                  crawlerData.setObito100k(obito100k);
        
                  crawlerData.setEstado(siglaEstadosSul[i]);

                  crawlerDAO.create(crawlerData);
                  listCrawler.add(crawlerData);
                }
              System.out.println("Crawling dos dados da COVID do estado " + siglaEstadosSul[i] + " finalizado, " + listCrawler.size() + " adicionadas.");
            }
            System.out.println("Thread Sudeste finalizada");
            } catch (IOException | ClassNotFoundException e1) {
            e1.printStackTrace();
          }
        }
      };
}
