(ns org.deeplearning4j.models.word2vec.StreamWork
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.word2vec StreamWork]))

(defn ->stream-work
  "Constructor.

  is - `org.deeplearning4j.models.word2vec.InputStreamCreator`
  count - `java.util.concurrent.atomic.AtomicInteger`"
  (^StreamWork [^org.deeplearning4j.models.word2vec.InputStreamCreator is ^java.util.concurrent.atomic.AtomicInteger count]
    (new StreamWork is count)))

(defn get-is
  "returns: `java.io.InputStream`"
  (^java.io.InputStream [^StreamWork this]
    (-> this (.getIs))))

(defn get-count
  "returns: `java.util.concurrent.atomic.AtomicInteger`"
  (^java.util.concurrent.atomic.AtomicInteger [^StreamWork this]
    (-> this (.getCount))))

(defn set-count
  "count - `java.util.concurrent.atomic.AtomicInteger`"
  ([^StreamWork this ^java.util.concurrent.atomic.AtomicInteger count]
    (-> this (.setCount count))))

(defn count-down
  ""
  ([^StreamWork this]
    (-> this (.countDown))))

