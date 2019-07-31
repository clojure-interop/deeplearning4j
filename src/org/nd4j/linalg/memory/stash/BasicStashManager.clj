(ns org.nd4j.linalg.memory.stash.BasicStashManager
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.memory.stash BasicStashManager]))

(defn ->basic-stash-manager
  "Constructor."
  (^BasicStashManager []
    (new BasicStashManager )))

(defn check-if-stash-exists
  "stash-id - `T`

  returns: `<T> boolean`"
  ([^BasicStashManager this stash-id]
    (-> this (.checkIfStashExists stash-id))))

(defn get-stash
  "stash-id - `T`

  returns: `<T> org.nd4j.linalg.memory.stash.Stash<T>`"
  ([^BasicStashManager this stash-id]
    (-> this (.getStash stash-id))))

(defn create-stash-if-not-exists
  "stash-id - `T`

  returns: `<T> org.nd4j.linalg.memory.stash.Stash<T>`"
  ([^BasicStashManager this stash-id]
    (-> this (.createStashIfNotExists stash-id))))

