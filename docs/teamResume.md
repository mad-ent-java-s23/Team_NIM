# Team NIM - Resume

### Team Name: Team NIM (not in Madison)

### Project Name - Wordle Clone

### Objectives (EDITED)
#### RESTful API
1. Using the NYTimes [API](https://www.nytimes.com/svc/wordle/v2/), develop an end point where users can access the 'word of the day'
2. Users will be able to:
   - Get the Word of the day
   - Get a word from a date search (limited to the start of the NYTimes acquisition of Wordle - June, 19, 2021)
   - Get all of the words up-to-date
3. Responses for the GET should look as follows:
   <pre>
   Wordle {
      editor='*who wrote it*', 
      solution='*the word*',      
      id=*some int, 
      printDate='2023-03-01'
   }
   </pre>

#### Additional functionalities to be added at a later date
1. Get the Word of the day (NYTimes) and add it to the TeamNIM API automatically
2. Multiple Day search
3. Add the ability to POST a new word to the database, with functionality to check for duplicates and validity:
   - Not only duplicates, but would need to establish a check for whether the POSTed word is an actual word
   - May require using an additional API such as [Merriam-Webster Dictionary](https://dictionaryapi.com/)
   - *This may also pose potential problems since some words may be considered offensive (see the [Wordle Wiki](https://en.wikipedia.org/wiki/Wordle) and the NYTimes acquisition section)


#### Game interface (to be added later)
1. Develop user-friendly interface that allows players to input guesses
2. Create an algorithm to randomly select a five-letter word and tracks player progression as they attempt to guess the correct word
3. Implement a scoring system – correct guesses, incorrect guesses (tries), etc.
4. Ensure game is accessible to a wide range of users (including those with disabilities or with assistive technologies

## APIs and other links
List APIs and links that are used:
- [Rapid API - Wordle](https://rapidapi.com/Alejandro99aru/api/wordle-answers-solutions)
- [NYTimes API](https://www.nytimes.com/svc/wordle/v2/)
- [Wordle Vulnerabilities](https://siliconangle.com/2022/12/19/api-vulnerabilities-wordle-exposed-answers-opened-door-potential-hacking/)
- [More on Wordle](https://en.wikipedia.org/wiki/Wordle)

### Members
#### Myo:
1. ...
2. ...
3. ...

#### Matt:
- Bachelor's degrees in Biology and Microbiology.
- Got a job in a biotech company for a break year before going to med school, became fascinated by the tech, switched from the 'bio' part of the word to the 'tech' part of the word. 
- Worked as an engineer for the last 6 years. Main areas of focus are microfluidics and laser-optics. I design, build and maintain equipment used in labs all around the world (that's how I ended up in Norway).
- Now that I have the 'bio' and the 'tech' portions down, I'm here to learn how how to write code for the machines that I design in order to make me a real swiss army knife. 

#### Keith:
- Worked as a lecturer at the University of Wisconsin-Platteville for twelve years. Responsibilities included teaching undergraduate music courses in theory and performance, developing and implementing new curricula, and collaborating with colleagues in recruitment, recording, and performance.
- Co-developed and implemented online music courses in Music Theory and Music Appreciation.
- Mentored other faculty members with online teaching.
- Strong communication and presentation skills.
- Developing experience in using languages such as Java, Javascript, and PHP.
- Bachelor, Master, and Doctorate degrees in Music from Northern Illinois, Arizona State, and the University of Wisconsin. 
