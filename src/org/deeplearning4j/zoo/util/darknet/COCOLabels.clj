(ns org.deeplearning4j.zoo.util.darknet.COCOLabels
  "Helper class that returns label descriptions for YOLO models trained with COCO."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.zoo.util.darknet COCOLabels]))

(defn ->coco-labels
  "Constructor.

  throws: java.io.IOException"
  (^COCOLabels []
    (new COCOLabels )))

