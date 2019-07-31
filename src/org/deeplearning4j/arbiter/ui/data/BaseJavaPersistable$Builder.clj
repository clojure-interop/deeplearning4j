(ns org.deeplearning4j.arbiter.ui.data.BaseJavaPersistable$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.ui.data BaseJavaPersistable$Builder]))

(defn ->builder
  "Constructor."
  (^BaseJavaPersistable$Builder []
    (new BaseJavaPersistable$Builder )))

(defn session-id
  "session-id - `java.lang.String`

  returns: `T`"
  ([^BaseJavaPersistable$Builder this ^java.lang.String session-id]
    (-> this (.sessionId session-id))))

(defn timestamp
  "timestamp - `long`

  returns: `T`"
  ([^BaseJavaPersistable$Builder this ^Long timestamp]
    (-> this (.timestamp timestamp))))

