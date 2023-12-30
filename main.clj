(ns rps) 

(defn is-draw [playerA playerB]
  (= playerA playerB))

(defn is-win [playerA playerB]
  (or (and (= playerA "rock") (= playerB "scissors")) 
      (and (= playerA "scissors") (= playerB "paper")) 
      (and (= playerA "paper") (= playerB "rock"))))

(def input (read-line))

(def options ["rock" "paper" "scissors"])

(def comp-choice (rand-nth options))

(println (str "computer picked " comp-choice))

(cond 
      (is-win input comp-choice) (println "you win")
      (is-draw input comp-choice) (println "draw")
      :else (println "you lose"))
