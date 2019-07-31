(ns org.datavec.api.util.ndarray.DataOutputWrapperStream
  "A simple class to wrap a DataOutput instance in an OutputStream"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.util.ndarray DataOutputWrapperStream]))

(defn ->data-output-wrapper-stream
  "Constructor."
  (^DataOutputWrapperStream []
    (new DataOutputWrapperStream )))

(defn write
  "b - `int`

  throws: java.io.IOException"
  ([^DataOutputWrapperStream this ^Integer b]
    (-> this (.write b))))

