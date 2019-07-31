(ns org.deeplearning4j.arbiter.server.cli.NeuralNetTypeValidator
  "Created by agibsonccc on 3/13/17."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.server.cli NeuralNetTypeValidator]))

(defn ->neural-net-type-validator
  "Constructor."
  (^NeuralNetTypeValidator []
    (new NeuralNetTypeValidator )))

(defn validate
  "Validate the parameter.

  name - The name of the parameter (e.g. \"-host\"). - `java.lang.String`
  value - The value of the parameter that we need to validate - `java.lang.String`

  throws: com.beust.jcommander.ParameterException - Thrown if the value of the parameter is invalid."
  ([^NeuralNetTypeValidator this ^java.lang.String name ^java.lang.String value]
    (-> this (.validate name value))))

