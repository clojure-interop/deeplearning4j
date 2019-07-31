(ns org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException
  "Indicates that user is attempting to import a Keras model configuration that
 is malformed or invalid in some other way.
 See http://deeplearning4j.org/model-import-keras for more information."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.exceptions InvalidKerasConfigurationException]))

(defn ->invalid-keras-configuration-exception
  "Constructor.

  message - `java.lang.String`
  cause - `java.lang.Throwable`"
  (^InvalidKerasConfigurationException [^java.lang.String message ^java.lang.Throwable cause]
    (new InvalidKerasConfigurationException message cause))
  (^InvalidKerasConfigurationException [^java.lang.String message]
    (new InvalidKerasConfigurationException message)))

