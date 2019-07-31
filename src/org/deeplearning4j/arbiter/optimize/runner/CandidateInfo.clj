(ns org.deeplearning4j.arbiter.optimize.runner.CandidateInfo
  "Simple helper class to store status of a candidate that is/has been/will be executed"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.optimize.runner CandidateInfo]))

(defn ->candidate-info
  "Constructor."
  (^CandidateInfo []
    (new CandidateInfo )))

