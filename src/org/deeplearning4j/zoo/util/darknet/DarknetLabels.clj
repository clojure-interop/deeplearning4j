(ns org.deeplearning4j.zoo.util.darknet.DarknetLabels
  "Helper class that returns label descriptions for Darknet models trained with ImageNet."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.zoo.util.darknet DarknetLabels]))

(defn ->darknet-labels
  "Constructor.

  Calls this(true).
  Defaults to 1000 clasess

  throws: java.io.IOException"
  (^DarknetLabels []
    (new DarknetLabels ))
  (^DarknetLabels [^Boolean shortnames ^Integer num-classes]
    (new DarknetLabels shortnames num-classes))
  (^DarknetLabels [^Integer num-classes]
    (new DarknetLabels num-classes)))

