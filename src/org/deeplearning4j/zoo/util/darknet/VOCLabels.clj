(ns org.deeplearning4j.zoo.util.darknet.VOCLabels
  "Helper class that returns label descriptions for YOLO models trained with Pascal VOC."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.zoo.util.darknet VOCLabels]))

(defn ->voc-labels
  "Constructor.

  throws: java.io.IOException"
  (^VOCLabels []
    (new VOCLabels )))

