(ns org.ansj.recognition.impl.SynonymsRecgnition
  "同义词功能"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.recognition.impl SynonymsRecgnition]))

(defn ->synonyms-recgnition
  "Constructor.

  key - `java.lang.String`"
  (^SynonymsRecgnition [^java.lang.String key]
    (new SynonymsRecgnition key))
  (^SynonymsRecgnition []
    (new SynonymsRecgnition )))

(defn recognition
  "result - `org.ansj.domain.Result`"
  ([^SynonymsRecgnition this ^org.ansj.domain.Result result]
    (-> this (.recognition result))))

