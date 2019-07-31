(ns org.nd4j.linalg.jcublas.util.FFTUtils
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.jcublas.util FFTUtils]))

(defn ->fft-utils
  "Constructor."
  (^FFTUtils []
    (new FFTUtils )))

(defn *get-plan-for
  "Get the plan for the given buffer (C2C for float Z2Z for double)

  buff - the buffer to get the plan for - `org.nd4j.linalg.api.buffer.DataBuffer`

  returns: the plan for the given buffer - `int`"
  (^Integer [^org.nd4j.linalg.api.buffer.DataBuffer buff]
    (FFTUtils/getPlanFor buff)))

