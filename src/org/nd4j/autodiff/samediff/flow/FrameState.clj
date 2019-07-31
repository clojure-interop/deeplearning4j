(ns org.nd4j.autodiff.samediff.flow.FrameState
  "This class is a holder for state of loops imported from TensorFlow, via frame_name"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.autodiff.samediff.flow FrameState]))

(defn ->frame-state
  "Constructor.

  frame-name - `java.lang.String`"
  (^FrameState [^java.lang.String frame-name]
    (new FrameState frame-name)))

(defn get-number-of-cycles
  "This method returns number of cycles for this frame

  returns: `int`"
  (^Integer [^FrameState this]
    (-> this (.getNumberOfCycles))))

(defn increment-number-of-cycles
  "This method increments number of cycles by 1"
  ([^FrameState this]
    (-> this (.incrementNumberOfCycles))))

