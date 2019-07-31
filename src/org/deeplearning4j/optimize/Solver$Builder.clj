(ns org.deeplearning4j.optimize.Solver$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.optimize Solver$Builder]))

(defn ->builder
  "Constructor."
  (^Solver$Builder []
    (new Solver$Builder )))

(defn configure
  "conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`

  returns: `org.deeplearning4j.optimize.Solver$Builder`"
  (^org.deeplearning4j.optimize.Solver$Builder [^Solver$Builder this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf]
    (-> this (.configure conf))))

(defn listener
  "listeners - `org.deeplearning4j.optimize.api.TrainingListener`

  returns: `org.deeplearning4j.optimize.Solver$Builder`"
  (^org.deeplearning4j.optimize.Solver$Builder [^Solver$Builder this ^org.deeplearning4j.optimize.api.TrainingListener listeners]
    (-> this (.listener listeners))))

(defn listeners
  "listeners - `java.util.Collection`

  returns: `org.deeplearning4j.optimize.Solver$Builder`"
  (^org.deeplearning4j.optimize.Solver$Builder [^Solver$Builder this ^java.util.Collection listeners]
    (-> this (.listeners listeners))))

(defn model
  "model - `org.deeplearning4j.nn.api.Model`

  returns: `org.deeplearning4j.optimize.Solver$Builder`"
  (^org.deeplearning4j.optimize.Solver$Builder [^Solver$Builder this ^org.deeplearning4j.nn.api.Model model]
    (-> this (.model model))))

(defn build
  "returns: `org.deeplearning4j.optimize.Solver`"
  (^org.deeplearning4j.optimize.Solver [^Solver$Builder this]
    (-> this (.build))))

