# *FootBall App*
![alt text](https://www.api-football.com/public/img/home1/hero-banner.png)
# Indice
1. [Introduzione](#introduzione)
2. [Funzionamento](#funzionamento)
3. [Package e Classi](#packageeclassi)
4. [Richieste](#richieste)
    1. [Esempi](#esempi)
5. [Stats e Filtri ](#statsefiltri)
    1. [Esempi](#esempistats)
7. [Diagrammi UML](#diagrammiuml)
    1. [Diagramma dei Casi d'Uso](#diagrammacasiduso)
    2. [Diagrammi delle Classi](#diagrammiclassi)
    3. [Diagrammi delle Sequenze](#diagrammisequenze)
8. [Software utilizzati](#softwareutilizzati)
9. [Autori](#autori)

# Introduzione <a name="introduzione"></a>
> La FootBallApp è un'applicazione Java sviluppata in Eclipse che permette di analizzare le competizioni di calcio di 3 nazioni diverse. 
> Per fare ciò si sono utilizzate le API disponibili dal sito [//football-data.org](https://www.football-data.org.).
> Scelte le tre nazioni è possibile visualizzare le competizioni, le statistiche relative a tali competizioni e ad una singola competizione.   

***

## Funzionamento <a name="funzionamento"></a>
> Per prima cosa bisogna fare la clone della seguente [repository](https://github.com/MalatestaDavide/ProgrammazioneAdOggettiLuglio2021.git) (```https://github.com/MalatestaDavide/ProgrammazioneAdOggettiLuglio2021.git```) così da averla nel gitrepository di eclipse e poi va importato il progetto Maven creato attraverso spring.
> 
> In seguito basta mandare in run l'applicazione come SpringBootApplication ```run --> Run as --> SpringBootApp``` ed eseguire le richieste di tipo ```GET``` su postman sulla porta predefinita 8080 ```https://localhost:8080/```.
> 
> Affinche il progetto funzioni sono state create delle classi che scaricano tutte le informazioni relative alle competizioni scelte in un ArrayList<String> e che tramite il parsing traformano il file json in un oggetto java.
> 
> L'utilizzo dell'API è possibile grazie ad un token di autenticazione gratuito con il quale abbiamo accesso solo ad una parte dei dati del [sito](https://www.football-data.org/coverage): in particolare di ciascuna nazione sono disponibili solo alcune competizioni ovvero i campionati principali.
>  
> In questo caso sono state scelte **Italia, Spagna e Francia** le cui competizioni accessibili sono rispettivamente **Serie A, Primera Division e Ligue 1**.
Sono presenti statistiche sul numero di squadre delle varie competizioni, stagioni disponibili, durata delle competizioni, media dei punti di ogni squadra della competizione per ogni partita. 

***

## Package e Classi <a name="packageeclassi"></a>

| Package     | Classi        |   Utilizzo    |
| ------------|---------------|---------------|
| Main        | FootballApp.java     | Classe principale |
| Controller  | Controller.java    | Gestisce tutte le richieste che l'utente può fare.|
| Model       | Areas.java           | Contiente le info delle nazioni.|
|             | awayTeam.java        | Contiene le infro della squadra fuori casa.|
|             | Competitions.java   | Contiene le info di tutte le competizioni.|
|             | homeTeam.java    |  Contiene le info della squadra in casa.|
|             | Matches.java    | Contiene le info delle partite.|
|             | Score.java      |Contiene le info del vincitore della partita.|
|             | Seasons.java    |Contiene le info delle stagioni.|
|             | singleCompetition.java   |Contiene le info di una competizione scelta.|
|             | Teams.java        | Contiene le info delle squadre.|
| Service     | Stats&Filters.java    |Contiene le statistiche e i filtri sulle competizioni.|
| Downloader  | Downloader.java |Effettua il download dei dati in una stringa.|
|             | Url.java     | Gestisce la connessione con l'url API e l'autentificazione con il token.|
|             | DataBase.java    |Ottiene le info dalle API.|        
|             | Parsing.java   |  Parsing da Json a Object.  |
| Exceptions  | MissingCompetition.java |Gestisce l'inserimento errato di una competizione.|
|             | MissingSeason.java |Gestisce l'inserimento errato di una stagione.|
***

## Richieste <a name="richieste"></a>
| Tipo         | Rotte         | Descrizione   |
| ------------ |---------------|---------------|
|   ```GET```  | /competitions | Questa richiesta mi restituisce i dettagli delle 3 competizioni scelte.|
|   ```GET```  | /competition{id}|Ponendo al posto di id SA, PD o L1, ottengo i dettagli di 1 singola competizione.|
|   ```GET```  | /matches{id}2020|Ponendo al posto di id SA, PD o L1, ottengo le partite di 1 singola competizione.|                                                              |   ```GET```  | /numberOfTeams|Restituisce il numero medio minimo e massimo delle squadre.|
|   ```GET```  | /savedSeason |Restituisce il numero delle stagioni salvate per ogi competizione e la media tra di esse.|
|   ```GET```  | /duration    |Restituisce la durata delle stagioni delle 3 competizioni.|
|   ```GET```  | /avgPointsSA    |Restituisce i punti delle squadre della SerieA.|    
    
***

### Esempi <a name="esempi"></a>
Un esempio di richiesta è il seguente : ```https://localhost:8080/competitions```
    
```
[
    {
        "id": 2019,
        "name": "Serie A",
        "area": {
            "id": 2114,
            "name": "Italy"
        },
        "currentSeason": {
            "id": 757,
            "startDate": "2021-08-22",
            "endDate": "2022-05-22",
            "currentMatchDay": 0
        }
    },
    {
        "id": 2014,
        "name": "Primera Division",
        "area": {
            "id": 2224,
            "name": "Spain"
        },
        "currentSeason": {
            "id": 380,
            "startDate": "2021-08-13",
            "endDate": "2022-05-22",
            "currentMatchDay": 0
        }
    },
    {
        "id": 2015,
        "name": "Ligue 1",
        "area": {
            "id": 2081,
            "name": "France"
        },
        "currentSeason": {
            "id": 746,
            "startDate": "2021-08-08",
            "endDate": "2022-05-22",
            "currentMatchDay": 0
        }
    }
]
```
    
***

## Stats e Filtri <a name="statsefiltri"></a>
| Tipo         | Stats&Filtri   | Descrizione   |
| ------------ |---------------|---------------|
|  ```GET```   | numberOfTeams |Ritorna il numero di teams per ogni competizione e la loro media |
|  ```GET```   | savedSeason   | Ritorna il numero di stagioni salvate per competizione e la loro media |
|  ```GET```   | duration      | Ritorna la durata delle stagioni relative alle competizioni |    
|  ```GET```   | avgPonts      | Ritorna la media dei punti delle squadre |    
    
### Esempi <a name="esempistats"></a>
Un esempio di statistica è il seguente : ```https://localhost:8080/duration``` 
    
``` 
   {
    "Durata della Primera division in mesi(M) e giorni(D)": "P8M10D",
    "Durata della Legue 1 in mesi(M) e giorni(D)": "P9M1D",
    "Durata della Serie A in mesi(M) e giorni(D)": "P8M3D"
    } 
```    
> **Note:** P8M10D viene interpretato come segue: P sta per periodo; 8M sta per 8 mesi e 10D sta per 10 giorni.
    
***

## Diagrammi UML <a name="diagrammiuml"></a>

### Diagramma dei Casi d'Uso <a name="diagrammacasiduso"></a>

![UseCaseDiagram_UML](https://user-images.githubusercontent.com/86164915/125841966-b92a1587-1d78-4269-8643-feca116238e2.jpg)

***

### Diagrammi delle Classi <a name="diagrammiclassi"></a>

![ClassDiagram_UML](https://user-images.githubusercontent.com/86164915/125852073-94b8b6e8-e2b8-460a-a9bd-d15730f1e2da.jpg)

    
 ![Downloader](https://user-images.githubusercontent.com/86164915/126871140-3fd267be-9436-409e-8e42-385294f0ac98.jpg)
    
 ![Stat](https://user-images.githubusercontent.com/86164915/126873287-57648fe2-a2b0-470e-9c78-abba98940a5b.jpg)
    
 ![Contr](https://user-images.githubusercontent.com/86164915/126873303-c1fc184f-ead2-49c4-911b-cb3e0ef91762.jpg)
    
    

***

### Diagrammi delle Sequenze <a name="diagrammisequenze"></a>

  ![sequenziale](https://user-images.githubusercontent.com/86164915/126873330-8450c110-fa0d-43f0-9090-78b3d0e19c49.jpg) 
    
***

## Software utilizzati <a name="softwareutilizzati"></a>

> * [Eclipse](https://www.eclipse.org/): 2021-06 (4.20.0) - Ambiente di sviluppo.
> * [Postman](https://www.postman.com/): Version v8.7.0  - App per testare le API.
> * [SpringBoot](https://spring.io/projects/spring-boot): Version v2.5.2 - Framework per la creazione e lo sviluppo di applicazioni Java.
> * [UMLDesigner](http://www.umldesigner.org/): Version v9.0.0- App per generare i diagrammi UML.
> * [Maven](https://maven.apache.org/): Version v3.8.1 - Strumento di build per la gestione di progetti Java.
> * [JavaDoc](https://docs.oracle.com/javase/8/docs/technotes/tools/windows/javadoc.html): - Strumento che genera una documentazione automatica utilizzando tag specifici nel codice.
> * [JUnit 5](https://junit.org/junit5/): Version v5.7.2 - Framework open source usato per scrivere ed eseguire unit testing per Java.

***

## Autori <a name="autori"></a>

- Vascello Francesco Pio
- Malatesta Davide

> **Note:** Il lavoro è stato suddiviso equamente tra i membri del gruppo infatti entrambi hanno contribuito allo sviluppo del codice, dei diagrammi UML, dei filtri, delle statistiche e delle classi.



