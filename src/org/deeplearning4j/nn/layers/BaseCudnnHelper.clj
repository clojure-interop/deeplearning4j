(ns org.deeplearning4j.nn.layers.BaseCudnnHelper
  "Functionality shared by all cuDNN-based helpers."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.layers BaseCudnnHelper]))

(defn ->base-cudnn-helper
  "Constructor."
  (^BaseCudnnHelper []
    (new BaseCudnnHelper )))

(defn *to-cudnn-data-type
  "type - `org.nd4j.linalg.api.buffer.DataBuffer$Type`

  returns: `int`"
  (^Integer [^org.nd4j.linalg.api.buffer.DataBuffer$Type type]
    (BaseCudnnHelper/toCudnnDataType type)))

(defn check-supported
  "returns: `boolean`"
  (^Boolean [^BaseCudnnHelper this]
    (-> this (.checkSupported))))

