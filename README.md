# ProgrammazioneAdOggettiLuglio2021

# Indice
1. [Introduzione](#introduzione)
2. [Funzionamento](#funzionamento)
3. [Package e Classi](#packageeclassi)
4. [Richieste](#richieste)
    1. [Esempi](#esempi)
5. [Stats e Filtri ](#statsefiltri)
6. [Diagrammi UML](#diagrammiuml)
    1. [Diagramma dei Casi d'Uso](#diagrammacasiduso)
    2. [Diagrammi delle Classi](#diagrammiclassi)
    3. [Diagrammi delle Sequenze](#diagrammisequenze)
7. [Software utilizzati](#softwareutilizzati)
8. [Autori](#autori)

# Introduzione <a name="introduzione"></a>
> La FootBallApp è un'applicazione Java sviluppata in Eclipse che permette di analizzare le competizioni di calcio di 3 nazioni diverse. 
> Per fare ciò si sono utilizzate le API disponibili dal sito [FootBallApp](https://www.football-data.org.).
> Scelte le tre nazioni è possibile visualizzare le competizioni, le statistiche relative a tali competizioni e ad una singola competizione. Inoltre, tramite un ID sarà possibile calcolare le statistiche in base a dei filtri scelti.   

***

## Funzionamento <a name="funzionamento"></a>
> Per prima cosa bisogna fare la clone della seguente [repository](https://github.com/MalatestaDavide/ProgrammazioneAdOggettiLuglio2021.git) (```https://github.com/MalatestaDavide/ProgrammazioneAdOggettiLuglio2021.git```) così da averla nel gitrepository di eclipse e poi va importato il progetto Maven creato attraverso spring.
> 
> In seguito basta mandare in run l'applicazione come SpringBootApplication ```run --> Run as --> SpringBootApp``` ed eseguire le richieste di tipo ```GET``` su postman sulla porta predefinita 8080 ```https://localhost:8080/```.
> 
> Affinche il progetto funzioni sono state create delle classi che scaricano tutte le informazioni relative alle competizioni scelte in un file json opportunamente locato ```src/main/resources/file/json/API.json``` e che tramite il parsing traformano il file json in un oggetto java.
> 
> L'utilizzo dell'API è possibile grazie ad un token di autenticazione gratuito con il quale abbiamo accesso solo ad una parte dei dati del [sito](https://www.football-data.org/coverage).

***

## Package e Classi <a name="packageeclassi"></a>

| Package     | Classi        |   Utilizzo    |
| ------------|---------------|---------------|
| Main        | FootballApp.class     | Classe principale |
| Controller  | Controller.class    | Gestisce tutte le richieste che l'utente può fare.|
| Model       | Areas.class           | Contiente le info delle nazioni.|
|             | awayTeam.class        | Contiene le infro della squadra fuori casa.|
|             | Competitions.class   | Contiene le info di tutte le competizioni.|
|             | homeTeam.class    |  Contiene le info della squadra in casa.|
|             | Matches.class    | Contiene le info delle partite.|
|             | Score.class      |Contiene le info del vincitore della partita.|
|             | Seasons.class    |Contiene le info delle stagioni.|
|             | singleCompetition.class   |Contiene le info di una competizione scelta.|
|             | Teams.class        | Contiene le info delle squadre.|
| Service     | DataBase.class    |Ottiene le info dalle API.|
|             | File.class      |Salva una stringa in un file di testo.|
|             | Folder.class    |Contiene il percorso del file salvato.|
|             | Parsing.class   |  Parsing da Json a Object.  |
| Downloader  | Downloader.class |Effettua il download dei dati in una stringa.|
|             | Url.class | Gestisce la connessione con l'url API e l'autentificazione con il token.|

***

## Richieste <a name="richieste"></a>

***

### Esempi <a name="esempi"></a>

***

## Stats e Filtri <a name="statsefiltri"></a>

***

## Diagrammi UML <a name="diagrammiuml"></a>

***

### Diagramma dei Casi d'Uso <a name="diagrammacasiduso"></a>

![UseCaseDiagram_UML](https://user-images.githubusercontent.com/86164915/125841966-b92a1587-1d78-4269-8643-feca116238e2.jpg)


***

### Diagrammi delle Classi <a name="diagrammiclassi"></a>

![ClassDiagram_UML](https://user-images.githubusercontent.com/86164915/125852073-94b8b6e8-e2b8-460a-a9bd-d15730f1e2da.jpg)

***

### Diagrammi delle Sequenze <a name="diagrammisequenze"></a>

***

## Software utilizzati <a name="softwareutilizzati"></a>

> * [Eclipse](https://www.eclipse.org/): 2021-06 (4.20.0) - Ambiente di sviluppo.
> * [Postman](https://www.postman.com/): Version v8.7.0  - App per testare le API.
> * [SpringBoot](https://spring.io/projects/spring-boot): Version v2.5.2 - Framework per la creazione e lo sviluppo di applicazioni Java.
> * [UMLDesigner](http://www.umldesigner.org/): Version v9.0.0- App per generare i diagrammi UML.
> * [Maven](https://maven.apache.org/): Version v3.8.1 - Strumento di build per la gestione di progetti Java.
> * [JavaDoc](https://docs.oracle.com/javase/8/docs/technotes/tools/windows/javadoc.html): - Strumento che genera una documentazione automatica utilizzando tag specifici nel codice.

***

## Autori <a name="autori"></a>

- Vascello Francesco Pio
- Malatesta Davide

> **Note:** Il lavoro è stato suddiviso equamente tra i membri del gruppo infatti entrambi hanno contribuito allo sviluppo del codice, dei diagrammi UML, dei filtri, delle statistiche e delle classi.



