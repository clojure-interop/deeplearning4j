(ns org.deeplearning4j.arbiter.optimize.api.Candidate
  "Candidate: a proposed hyperparameter configuration.
 Also includes a map for data parameters, to configure things like data preprocessing, etc."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.optimize.api Candidate]))

(defn ->candidate
  "Constructor.

  value - `C`
  index - `int`
  flat-parameters - `double[]`
  data-parameters - `java.util.Map`
  e - `java.lang.Exception`"
  (^Candidate [value ^Integer index flat-parameters ^java.util.Map data-parameters ^java.lang.Exception e]
    (new Candidate value index flat-parameters data-parameters e))
  (^Candidate [value ^Integer index flat-parameters]
    (new Candidate value index flat-parameters)))

(defn get-value
  "returns: `C`"
  ([^Candidate this]
    (-> this (.getValue))))

