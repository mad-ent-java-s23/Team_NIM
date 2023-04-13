## Team NIM - Charter

### Purpose and Vision:

- Develop an API for accessing previously used words for the game Wordle

### Objective and Goals:

1. Using the NYTimes [API](https://www.nytimes.com/svc/wordle/v2/), develop an end point where users can access the 'word of the day'
2. Users will be able to:
  - Get the Word of the day
  - Get a word from a date search (limited to the start of the NYTimes acquisition of Wordle - June, 19, 2021)
  - Get all the words up-to-current-date
3. Responses for the GET should look as follows:
   <pre>
   Wordle {
      editor='*who wrote it*', 
      solution='*the word*',      
      id=*some int, 
      printDate='2023-03-01'
   }
   </pre>

### Future Goals: 
1. Develop user-friendly interface that allows players to input guesses
2. Create an algorithm to randomly select a five-letter word and tracks player progression as they attempt to guess the correct word
3. Implement a scoring system – correct guesses, incorrect guesses (tries), etc.
4. Ensure game is accessible to a wide range of users (including those with disabilities or with assistive technologies

### Roles & Responsibilities:

- Matt - Front-end, Back-end 
- Myo - 
- Keith - Back-end, Database

### Communication & Collaboration:

- We will use Slack, Teams, and this GitHub repository as the primary forms of communication.

### Milestones & Timeline:

- Week 9 (ending March 26)
    - [x] Resume completed
    - [x] Charter completed
    - [ ] Problem statement started
    - [ ] Project Plan started
    - [x] GitHub Repo created
- Week 10 (ending 4/2)
  - [X] POJO and DAO created
  - [X] Initial tests with the NYTimes API and/or rapidAPI
  - [X] Initialized a basic 'web service' for the current Wordle of the Day on the index page   
- Week 11 (ending 4/9)
  - [X] Front-End developed using Bootstrap
  - [X] Database developed using MySQL and uploaded to AWS
  - [X] Developed a 'Solutions' class to retrieve all of the words from the NYTimes Wordle API
  - [X] Developed service/application classes to direct users to the appropriate pages to access the JSON 
- Week 12  
  - [ ] Project due on 4/12, 7pm CST 

 