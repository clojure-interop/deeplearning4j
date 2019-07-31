(ns org.deeplearning4j.ui.storage.AgronaPersistable
  "Created by Alex on 07/10/2016."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.storage AgronaPersistable]))

(defn encode
  "buffer - `org.agrona.MutableDirectBuffer`"
  ([^AgronaPersistable this ^org.agrona.MutableDirectBuffer buffer]
    (-> this (.encode buffer))))

(defn decode
  "buffer - `org.agrona.DirectBuffer`"
  ([^AgronaPersistable this ^org.agrona.DirectBuffer buffer]
    (-> this (.decode buffer))))

