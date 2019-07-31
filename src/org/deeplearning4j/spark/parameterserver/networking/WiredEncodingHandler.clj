(ns org.deeplearning4j.spark.parameterserver.networking.WiredEncodingHandler
  "This MessageHandler implementation does the same as EncodingHandler, plus additionally:
 sends encoded messages over the wire  receives encoded messages from outer parties"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.parameterserver.networking WiredEncodingHandler]))

(defn ->wired-encoding-handler
  "Constructor.

  This method builds new WiredEncodingHandler instance

  threshold - Initial encoding threshold - `double`
  min-threshold - Minimal encoding threshold (for threshold decay) - `double`
  threshold-step - Decay step for threshold decay - `double`
  step-trigger - Sparse/Dense ratio that will trigger decay step. In range 0..100 - `double`
  step-delay - Minimal number of iterations between decay steps - `int`
  shake-frequency - How ofter we'll be sending dense updates with lower threshold - `int`
  boundary - `java.lang.Double`"
  (^WiredEncodingHandler [^Double threshold ^Double min-threshold ^Double threshold-step ^Double step-trigger ^Integer step-delay ^Integer shake-frequency ^java.lang.Double boundary]
    (new WiredEncodingHandler threshold min-threshold threshold-step step-trigger step-delay shake-frequency boundary))
  (^WiredEncodingHandler [^Double threshold ^Double min-threshold ^Double threshold-step ^Double step-trigger ^Integer step-delay ^Integer shake-frequency]
    (new WiredEncodingHandler threshold min-threshold threshold-step step-trigger step-delay shake-frequency))
  (^WiredEncodingHandler [^Double threshold ^java.lang.Double boundary]
    (new WiredEncodingHandler threshold boundary))
  (^WiredEncodingHandler [^Double threshold]
    (new WiredEncodingHandler threshold))
  (^WiredEncodingHandler []
    (new WiredEncodingHandler )))

