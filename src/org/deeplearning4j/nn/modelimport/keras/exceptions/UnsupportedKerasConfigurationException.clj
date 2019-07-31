(ns org.deeplearning4j.nn.modelimport.keras.exceptions.UnsupportedKerasConfigurationException
  "Indicates that user is attempting to import a Keras model configuration that
 is not currently supported.
 See http://deeplearning4j.org/model-import-keras for more information and
 file an issue at http://github.com/deeplearning4j/deeplearning4j/issues."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.exceptions UnsupportedKerasConfigurationException]))

(defn ->unsupported-keras-configuration-exception
  "Constructor.

  message - `java.lang.String`
  cause - `java.lang.Throwable`"
  (^UnsupportedKerasConfigurationException [^java.lang.String message ^java.lang.Throwable cause]
    (new UnsupportedKerasConfigurationException message cause))
  (^UnsupportedKerasConfigurationException [^java.lang.String message]
    (new UnsupportedKerasConfigurationException message)))

