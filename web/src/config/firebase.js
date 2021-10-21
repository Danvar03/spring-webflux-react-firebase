import firebase from "firebase/app";
import "firebase/auth";
import "firebase/firestore";

const config ={
    apiKey: "AIzaSyDKQxZQgJ3vJ-yzU9Bdj10PFX9njjiPWFk",
      authDomain: "question-adn-aswer.firebaseapp.com",
      projectId: "question-adn-aswer",
      storageBucket: "question-adn-aswer.appspot.com",
      messagingSenderId: "901831785121",
      appId: "1:901831785121:web:7042b1aa8e26dc15cccee0"
    };
    
    firebase.initializeApp(config);
    export const auth = firebase.auth;