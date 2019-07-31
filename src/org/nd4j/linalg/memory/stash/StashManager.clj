(ns org.nd4j.linalg.memory.stash.StashManager
  "This interface describes factory/holder for manipulating Stash objects"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.memory.stash StashManager]))

(defn check-if-stash-exists
  "stash-id - `T`

  returns: `<T> boolean`"
  ([^StashManager this stash-id]
    (-> this (.checkIfStashExists stash-id))))

(defn get-stash
  "stash-id - `T`

  returns: `<T> org.nd4j.linalg.memory.stash.Stash<T>`"
  ([^StashManager this stash-id]
    (-> this (.getStash stash-id))))

(defn create-stash-if-not-exists
  "stash-id - `T`

  returns: `<T> org.nd4j.linalg.memory.stash.Stash<T>`"
  ([^StashManager this stash-id]
    (-> this (.createStashIfNotExists stash-id))))

