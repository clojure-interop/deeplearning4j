(ns org.deeplearning4j.nn.conf.layers.AbstractLSTM
  "LSTM recurrent net, based on Graves: Supervised Sequence Labelling with Recurrent Neural Networks
 http://www.cs.toronto.edu/~graves/phd.pdf"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers AbstractLSTM]))

(defn get-l-1-by-param
  "Description copied from class: Layer

  param-name - Parameter name - `java.lang.String`

  returns: L1 value for that parameter - `double`"
  (^Double [^AbstractLSTM this ^java.lang.String param-name]
    (-> this (.getL1ByParam param-name))))

(defn get-l-2-by-param
  "Description copied from class: Layer

  param-name - Parameter name - `java.lang.String`

  returns: L2 value for that parameter - `double`"
  (^Double [^AbstractLSTM this ^java.lang.String param-name]
    (-> this (.getL2ByParam param-name))))

