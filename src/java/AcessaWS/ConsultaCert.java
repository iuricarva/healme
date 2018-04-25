/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AcessaWS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 *
 * @author icarv
 */
@ManagedBean
public class ConsultaCert {
    
    private String namePlatform;
    private PlatformModel model;
    private ArrayList<PlatformModel> loadSustainability = new ArrayList<PlatformModel>();
    private ArrayList<PlatformModel> loadHealth = new ArrayList<PlatformModel>();
    private final List<String> platforms = new ArrayList<String>();
   
    
    private String[] namePlatforms; 

    public String getNamePlatform() {
        return this.namePlatform;
    }

    public void setNamePlatform(String namePlatform) {
        this.namePlatform = namePlatform;
    }
    
     public void setPlatforms(String[] platforms) {
        this.namePlatforms = platforms;
        this.namePlatform = this.namePlatforms[0];
    }
    public int getLoadSustainability(){
        return this.loadSustainability.size();
    }
    
    public int getLoadHealth(){
        return this.loadHealth.size();
        //return 20;
    }
 
    
   
    public String[] getPlatforms() throws ParserConfigurationException, SAXException{
        try {    
            URL url = new URL("http://localhost:8080/WSHealMe/webresources/WSSecoRestful/getplatforms");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/xml");
            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
            String output = "", captura;
            captura = br.readLine();
            while (captura != null) {
		output+=captura;
                output+="\n";
                captura = br.readLine();
            }

            conn.disconnect();
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();  
            DocumentBuilder builder;  
            try{
                builder = factory.newDocumentBuilder();  
                Document document = builder.parse( new InputSource( new StringReader( output ) ) );
                NodeList nodes = document.getElementsByTagName("name");
                for(int i = 0; i<nodes.getLength(); i++){
                    this.platforms.add(nodes.item(i).getChildNodes().item(0).getNodeValue());
                }
                String[] a = new String[this.platforms.size()];
                return this.platforms.toArray((String[]) a);
        } catch (Exception e) {  
                e.printStackTrace();
            } 
            
        } catch (MalformedURLException e) {

		e.printStackTrace();
                //return e.getMessage();

	  } catch (IOException e) {

		e.printStackTrace();
                //return e.getMessage();

	}
        return null;
    }
    
    public PlatformModel getRetornaSust() throws ParserConfigurationException, SAXException{
       try {    
            URL url = new URL("http://localhost:8080/WSHealMe/webresources/WSSecoRestful/getsustainability");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/xml");
            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
            String output = "", captura;
            captura = br.readLine();
            while (captura != null) {
		output+=captura;
                output+="\n";
                captura = br.readLine();
            }

            conn.disconnect();
            this.model = new PlatformModel();
            PlatformModel modelSust;
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();  
            DocumentBuilder builder;  
            try{
                String teste;
                builder = factory.newDocumentBuilder();  
                Document document = builder.parse( new InputSource( new StringReader( output ) ) );
                NodeList nodes = document.getElementsByTagName("name");
                this.model.setName(nodes.item(0).getChildNodes().item(0).getNodeValue());                                          
                                
                if(this.getNamePlatform().equals(this.model.getName())){
                    return this.model;
                }else{
                    return null;
                }
                      
        } catch (Exception e) {  
                e.printStackTrace();
            } 
            
        } catch (MalformedURLException e) {

		e.printStackTrace();
                //return e.getMessage();

	  } catch (IOException e) {

		e.printStackTrace();
                //return e.getMessage();

	}
        return null;
    }
    
    public PlatformModel getRetornaHet() throws ParserConfigurationException, SAXException{
        try {
            URL url = new URL("http://localhost:8080/WSHealMe/webresources/WSSecoRestful/getheterogeneity");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/xml");
            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
            String output = "", captura;
            captura = br.readLine();
            while (captura != null) {
		output+=captura;
                output+="\n";
                captura = br.readLine();
            }

            conn.disconnect();
            this.model = new PlatformModel();
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();  
            DocumentBuilder builder;  
            try{
                String teste;
                builder = factory.newDocumentBuilder();  
                Document document = builder.parse( new InputSource( new StringReader( output ) ) );
                NodeList nodes = document.getElementsByTagName("name");
                this.model.setName(nodes.item(0).getChildNodes().item(0).getNodeValue());                                          
                                
                if(this.getNamePlatform().equals(this.model.getName())){
                    this.loadSustainability.add(model);
                    return this.model;
                }else{
                    return null;
                }
                      
        } catch (Exception e) {  
                e.printStackTrace();
            } 
            
        } catch (MalformedURLException e) {

		e.printStackTrace();
                //return e.getMessage();

	  } catch (IOException e) {

		e.printStackTrace();
                //return e.getMessage();

	}
        return null;
    }
        
    public PlatformModel getRetornaRegAb() throws ParserConfigurationException, SAXException{
        try {
            URL url = new URL("http://localhost:8080/WSHealMe/webresources/WSSecoRestful/getregenerationability");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/xml");
            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
            String output = "", captura;
            captura = br.readLine();
            while (captura != null) {
		output+=captura;
                output+="\n";
                captura = br.readLine();
            }

            conn.disconnect();
            this.model = new PlatformModel();
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();  
            DocumentBuilder builder;  
            try{
                String teste;
                builder = factory.newDocumentBuilder();  
                Document document = builder.parse( new InputSource( new StringReader( output ) ) );
                NodeList nodes = document.getElementsByTagName("name");
                this.model.setName(nodes.item(0).getChildNodes().item(0).getNodeValue());                                          
                                
                if(this.getNamePlatform().equals(this.model.getName())){
                    this.loadSustainability.add(model);
                    return this.model;
                }else{
                    return null;
                }
                      
        } catch (Exception e) {  
                e.printStackTrace();
            } 
            
        } catch (MalformedURLException e) {

		e.printStackTrace();
                //return e.getMessage();

	  } catch (IOException e) {

		e.printStackTrace();
                //return e.getMessage();

	}
        return null;
    }
    
    public PlatformModel getRetornaEfBal() throws ParserConfigurationException, SAXException{
        try {
            URL url = new URL("http://localhost:8080/WSHealMe/webresources/WSSecoRestful/geteffortbalance");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/xml");
            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
            String output = "", captura;
            captura = br.readLine();
            while (captura != null) {
		output+=captura;
                output+="\n";
                captura = br.readLine();
            }

            conn.disconnect();
            this.model = new PlatformModel();
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();  
            DocumentBuilder builder;  
            try{
                String teste;
                builder = factory.newDocumentBuilder();  
                Document document = builder.parse( new InputSource( new StringReader( output ) ) );
                NodeList nodes = document.getElementsByTagName("name");
                this.model.setName(nodes.item(0).getChildNodes().item(0).getNodeValue());                                          
                                
                if(this.getNamePlatform().equals(this.model.getName())){
                    this.loadSustainability.add(model);
                    return this.model;
                }else{
                    return null;
                }
                      
        } catch (Exception e) {  
                e.printStackTrace();
            } 
            
        } catch (MalformedURLException e) {

		e.printStackTrace();
                //return e.getMessage();

	  } catch (IOException e) {

		e.printStackTrace();
                //return e.getMessage();

	}
        return null;
    }
    
    public PlatformModel getRetornaExpBal() throws ParserConfigurationException, SAXException{
        try {
            URL url = new URL("http://localhost:8080/WSHealMe/webresources/WSSecoRestful/getexpertisebalance");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/xml");
            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
            String output = "", captura;
            captura = br.readLine();
            while (captura != null) {
		output+=captura;
                output+="\n";
                captura = br.readLine();
            }

            conn.disconnect();
            this.model = new PlatformModel();
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();  
            DocumentBuilder builder;  
            try{
                String teste;
                builder = factory.newDocumentBuilder();  
                Document document = builder.parse( new InputSource( new StringReader( output ) ) );
                NodeList nodes = document.getElementsByTagName("name");
                this.model.setName(nodes.item(0).getChildNodes().item(0).getNodeValue());                                          
                                
                if(this.getNamePlatform().equals(this.model.getName())){
                    this.loadSustainability.add(model);
                    return this.model;
                }else{
                    return null;
                }
                      
        } catch (Exception e) {  
                e.printStackTrace();
            } 
            
        } catch (MalformedURLException e) {

		e.printStackTrace();
                //return e.getMessage();

	  } catch (IOException e) {

		e.printStackTrace();
                //return e.getMessage();

	}
        return null;
    }
    
    public PlatformModel getRetornaVisib() throws ParserConfigurationException, SAXException{
         try {
            URL url = new URL("http://localhost:8080/WSHealMe/webresources/WSSecoRestful/getvisibility");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/xml");
            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
            String output = "", captura;
            captura = br.readLine();
            while (captura != null) {
		output+=captura;
                output+="\n";
                captura = br.readLine();
            }

            conn.disconnect();
            this.model = new PlatformModel();
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();  
            DocumentBuilder builder;  
            try{
                String teste;
                builder = factory.newDocumentBuilder();  
                Document document = builder.parse( new InputSource( new StringReader( output ) ) );
                NodeList nodes = document.getElementsByTagName("name");
                this.model.setName(nodes.item(0).getChildNodes().item(0).getNodeValue());                                          
                                
                if(this.getNamePlatform().equals(this.model.getName())){
                    this.loadSustainability.add(model);
                    return this.model;
                }else{
                    return null;
                }
                      
        } catch (Exception e) {  
                e.printStackTrace();
            } 
            
        } catch (MalformedURLException e) {

		e.printStackTrace();
                //return e.getMessage();

	  } catch (IOException e) {

		e.printStackTrace();
                //return e.getMessage();

	}
        return null;
    }
    
    public PlatformModel getRetornaProductivity() throws ParserConfigurationException, SAXException{
        try {    
            URL url = new URL("http://localhost:8080/WSHealMe/webresources/WSSecoRestful/getproductivity");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/xml");
            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
            String output = "", captura;
            captura = br.readLine();
            while (captura != null) {
		output+=captura;
                output+="\n";
                captura = br.readLine();
            }

            conn.disconnect();
            
            this.model = new PlatformModel();
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();  
            DocumentBuilder builder;  
            try{
                String teste;
                builder = factory.newDocumentBuilder();  
                Document document = builder.parse( new InputSource( new StringReader( output ) ) );
                NodeList nodes = document.getElementsByTagName("name");
                this.model.setName(nodes.item(0).getChildNodes().item(0).getNodeValue());
                                
                if(this.getNamePlatform().equals(this.model.getName())){
                    return this.model;
                }else{
                    return null;
                }
                
            } catch (Exception e) {  
                e.printStackTrace();
                //return e.getMessage();
            } 
            
        } catch (MalformedURLException e) {

		e.printStackTrace();
                //return e.getMessage();

	  } catch (IOException e) {

		e.printStackTrace();
                //return e.getMessage();

	}
        return null;
        
    }
    
    public PlatformModel getRetornaDiversity() throws ParserConfigurationException, SAXException{
        try {
            URL url = new URL("http://localhost:8080/WSHealMe/webresources/WSSecoRestful/getdiversity");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/xml");
            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
            String output = "", captura;
            captura = br.readLine();
            while (captura != null) {
		output+=captura;
                output+="\n";
                captura = br.readLine();
            }
            conn.disconnect();
            PlatformModel modelDiv;
            this.model = new PlatformModel();
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();  
            DocumentBuilder builder;  
            try{
                builder = factory.newDocumentBuilder();  
                Document document = builder.parse( new InputSource( new StringReader( output ) ) );
                NodeList nodes = document.getElementsByTagName("name");
                this.model.setName(nodes.item(0).getChildNodes().item(0).getNodeValue());
            if(this.getNamePlatform().equals(this.model.getName())){
                modelDiv = this.model;
                this.loadHealth.add(modelDiv);    
                return this.model;
                }else{
                    return null;
                }
                
            } catch (Exception e) {  
                e.printStackTrace();
                //return e.getMessage();
            }     
            
        } catch (MalformedURLException e) {

		e.printStackTrace();
                //return e.getMessage();

	  } catch (IOException e) {

		e.printStackTrace();
                //return e.getMessage();

	}
        
        return null;
    }
    
    public PlatformModel getRetornaNicheCreation() throws ParserConfigurationException, SAXException{
        try {    
            URL url = new URL("http://localhost:8080/WSHealMe/webresources/WSSecoRestful/getnichecreation");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/xml");
            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
            String output = "", captura;
            captura = br.readLine();
            while (captura != null) {
		output+=captura;
                output+="\n";
                captura = br.readLine();
            }

            conn.disconnect();
            
            this.model = new PlatformModel();
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();  
            DocumentBuilder builder;  
            try{
                builder = factory.newDocumentBuilder();  
                Document document = builder.parse( new InputSource( new StringReader( output ) ) );
                NodeList nodes = document.getElementsByTagName("name");
                this.model.setName(nodes.item(0).getChildNodes().item(0).getNodeValue());
                if(this.getNamePlatform().equals(this.model.getName())){
                    return this.model;
                }else{
                    return null;
                }
                
            } catch (Exception e) {  
                e.printStackTrace();
                //return e.getMessage();
            }
            
        } catch (MalformedURLException e) {

		e.printStackTrace();
                //return e.getMessage();

	  } catch (IOException e) {

		e.printStackTrace();
                //return e.getMessage();

	}
        return null;
        
    }
    
    public PlatformModel getRetornaHeatlh() throws ParserConfigurationException, SAXException{
        try {
            URL url = new URL("http://localhost:8080/WSHealMe/webresources/WSSecoRestful/gethealth");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/xml");
            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
            String output = "", captura;
            captura = br.readLine();
            while (captura != null) {
		output+=captura;
                output+="\n";
                captura = br.readLine();
            }

            conn.disconnect();
            this.model = new PlatformModel();
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();  
            DocumentBuilder builder;  
            try{
                String teste;
                builder = factory.newDocumentBuilder();  
                Document document = builder.parse( new InputSource( new StringReader( output ) ) );
                NodeList nodes = document.getElementsByTagName("name");
                this.model.setName(nodes.item(0).getChildNodes().item(0).getNodeValue());
                                
                if(this.getNamePlatform().equals(this.model.getName())){
                    this.loadSustainability.add(model);
                    return this.model;
                }else{
                    return null;
                }
            
        } catch (Exception e) {  
                e.printStackTrace();
            } 
            
        } catch (MalformedURLException e) {

		e.printStackTrace();
                //return e.getMessage();

	} catch (IOException e) {

		e.printStackTrace();
                //return e.getMessage();

	}
        
        return null;
    }
    
     public PlatformModel getData() throws ParserConfigurationException, SAXException{
       try {    
            URL url = new URL("http://localhost:8080/WSHealMe/webresources/WSSecoRestful/getdata");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/xml");
            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
            String output = "", captura;
            captura = br.readLine();
            while (captura != null) {
		output+=captura;
                output+="\n";
                captura = br.readLine();
            }

            conn.disconnect();
            this.model = new PlatformModel();
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();  
            DocumentBuilder builder;  
            try{
                String teste;
                builder = factory.newDocumentBuilder();  
                Document document = builder.parse( new InputSource( new StringReader( output ) ) );
                NodeList nodes = document.getElementsByTagName("name");
                this.model.setName(nodes.item(0).getChildNodes().item(0).getNodeValue());  
                nodes = document.getElementsByTagName("numberOfCountries");
                this.model.setNumberOfCountries(Integer.parseInt(nodes.item(0).getChildNodes().item(0).getNodeValue()));
                
                nodes = document.getElementsByTagName("developerCommits");
                this.model.setDeveloperCommits(Integer.parseInt(nodes.item(0).getChildNodes().item(0).getNodeValue()));
                nodes = document.getElementsByTagName("numberOfHoursWorked");
                this.model.setNumberOfHoursWorked(Integer.parseInt(nodes.item(0).getChildNodes().item(0).getNodeValue()));
                nodes = document.getElementsByTagName("numberOfNewMembers");
                this.model.setNumberOfNewMembers(Integer.parseInt(nodes.item(0).getChildNodes().item(0).getNodeValue()));
                nodes = document.getElementsByTagName("numberOfNodeTypes");
                this.model.setNumberOfNodeTypes(Integer.parseInt(nodes.item(0).getChildNodes().item(0).getNodeValue()));
                nodes = document.getElementsByTagName("semanticClosenessAvg");
                this.model.setSemanticClosenessAvg(Integer.parseInt(nodes.item(0).getChildNodes().item(0).getNodeValue()));
                nodes = document.getElementsByTagName("timeWorkTogether");
                this.model.setTimeWorkTogether(Integer.parseInt(nodes.item(0).getChildNodes().item(0).getNodeValue()));
                                
                if(this.getNamePlatform().equals(this.model.getName())){
                    return this.model;
                }else{
                    return null;
                }
                      
        } catch (Exception e) {  
                e.printStackTrace();
            } 
            
        } catch (MalformedURLException e) {

		e.printStackTrace();
                //return e.getMessage();

	  } catch (IOException e) {

		e.printStackTrace();
                //return e.getMessage();

	}
        return null;
    }
    
    public static void main(String[] args) throws ParserConfigurationException, SAXException {
        ConsultaCert c = new ConsultaCert();
        //c.setNamePlatform("Android");
        //c.getRetornaHet();
        c.getPlatforms();
        c.getData();
        //c.getRetornaDiversity();
        //int i = c.getCarregamento();
        //System.out.println(c.getCarregamento());
    }
}
