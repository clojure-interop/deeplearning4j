(ns org.deeplearning4j.util.ModelGuesser
  "Guess a model from the given path"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.util ModelGuesser]))

(defn ->model-guesser
  "Constructor."
  (^ModelGuesser []
    (new ModelGuesser )))

(defn *load-normalizer
  "A facade for ModelSerializer.restoreNormalizerFromInputStream(InputStream)

  is - the input stream to load form - `java.io.InputStream`

  returns: the loaded normalizer - `org.nd4j.linalg.dataset.api.preprocessor.Normalizer<?>`

  throws: java.io.IOException"
  (^org.nd4j.linalg.dataset.api.preprocessor.Normalizer [^java.io.InputStream is]
    (ModelGuesser/loadNormalizer is)))

(defn *load-config-guess
  "Load the model from the given file path

  path - the path of the file to \"guess\" - `java.lang.String`

  returns: the loaded model - `java.lang.Object`

  throws: java.lang.Exception"
  (^java.lang.Object [^java.lang.String path]
    (ModelGuesser/loadConfigGuess path)))

(defn *load-model-guess
  "Load the model from the given input stream

  stream - the path of the file to \"guess\" - `java.io.InputStream`
  temp-file-directory - May be null. The directory in which to create any temporary files - `java.io.File`

  returns: the loaded model - `org.deeplearning4j.nn.api.Model`

  throws: java.lang.Exception"
  (^org.deeplearning4j.nn.api.Model [^java.io.InputStream stream ^java.io.File temp-file-directory]
    (ModelGuesser/loadModelGuess stream temp-file-directory))
  (^org.deeplearning4j.nn.api.Model [^java.lang.String path]
    (ModelGuesser/loadModelGuess path)))

