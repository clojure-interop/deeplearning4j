(ns org.nd4j.linalg.util.InputStreamUtil
  "Input stream jcuda.utils"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.util InputStreamUtil]))

(defn ->input-stream-util
  "Constructor."
  (^InputStreamUtil []
    (new InputStreamUtil )))

(defn *count-lines
  "Count number of lines in a file

  is - `java.io.InputStream`

  returns: `int`

  throws: java.io.IOException"
  (^Integer [^java.io.InputStream is]
    (InputStreamUtil/countLines is)))

