(ns org.datavec.api.util.ndarray.DataInputWrapperStream
  "A simple class to wrap a DataInput instance in an InputStream"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.util.ndarray DataInputWrapperStream]))

(defn ->data-input-wrapper-stream
  "Constructor."
  (^DataInputWrapperStream []
    (new DataInputWrapperStream )))

(defn read
  "returns: `int`

  throws: java.io.IOException"
  (^Integer [^DataInputWrapperStream this]
    (-> this (.read))))

