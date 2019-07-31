(ns com.atilika.kuromoji.compile.ProgressLog
  "Simple progress logger"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji.compile ProgressLog]))

(defn ->progress-log
  "Constructor."
  (^ProgressLog []
    (new ProgressLog )))

(defn *begin
  "message - `java.lang.String`"
  ([^java.lang.String message]
    (ProgressLog/begin message)))

(defn *end
  ""
  ([]
    (ProgressLog/end )))

(defn *println
  "message - `java.lang.String`"
  ([^java.lang.String message]
    (ProgressLog/println message)))

