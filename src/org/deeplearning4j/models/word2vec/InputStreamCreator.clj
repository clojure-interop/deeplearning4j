(ns org.deeplearning4j.models.word2vec.InputStreamCreator
  "Created by agibsonccc on 10/19/14."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.word2vec InputStreamCreator]))

(defn create
  "Create an input stream

  returns: `java.io.InputStream`"
  (^java.io.InputStream [^InputStreamCreator this]
    (-> this (.create))))

