(ns org.deeplearning4j.graph.exception.NoEdgesException
  "Unchecked exception, thrown to signify that an operation (usually on a vertex) cannot be completed
 because there are no edges for that vertex."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.graph.exception NoEdgesException]))

(defn ->no-edges-exception
  "Constructor.

  s - `java.lang.String`
  e - `java.lang.Exception`"
  (^NoEdgesException [^java.lang.String s ^java.lang.Exception e]
    (new NoEdgesException s e))
  (^NoEdgesException [^java.lang.String s]
    (new NoEdgesException s))
  (^NoEdgesException []
    (new NoEdgesException )))

