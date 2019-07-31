(ns org.ansj.recognition.arrimpl.NewWordRecognition
  "新词识别"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.recognition.arrimpl NewWordRecognition]))

(defn ->new-word-recognition
  "Constructor.

  learn - `org.ansj.dic.LearnTool`"
  (^NewWordRecognition [^org.ansj.dic.LearnTool learn]
    (new NewWordRecognition learn)))

(defn recognition
  "terms - `org.ansj.domain.Term[]`"
  ([^NewWordRecognition this terms]
    (-> this (.recognition terms))))

