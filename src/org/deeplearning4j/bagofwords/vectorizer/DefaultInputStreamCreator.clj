(ns org.deeplearning4j.bagofwords.vectorizer.DefaultInputStreamCreator
  "Created by agibsonccc on 10/20/14."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.bagofwords.vectorizer DefaultInputStreamCreator]))

(defn ->default-input-stream-creator
  "Constructor.

  iter - `org.deeplearning4j.text.documentiterator.DocumentIterator`"
  (^DefaultInputStreamCreator [^org.deeplearning4j.text.documentiterator.DocumentIterator iter]
    (new DefaultInputStreamCreator iter)))

(defn create
  "Description copied from interface: InputStreamCreator

  returns: `java.io.InputStream`"
  (^java.io.InputStream [^DefaultInputStreamCreator this]
    (-> this (.create))))

