(ns org.ansj.domain.NewWord
  "新词发现,实体名"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.domain NewWord]))

(defn ->new-word
  "Constructor.

  name - `java.lang.String`
  nature - `org.ansj.domain.Nature`
  score - `double`"
  (^NewWord [^java.lang.String name ^org.ansj.domain.Nature nature ^Double score]
    (new NewWord name nature score))
  (^NewWord [^java.lang.String name ^org.ansj.domain.Nature nature]
    (new NewWord name nature)))

(defn active?
  "returns: `boolean`"
  (^Boolean [^NewWord this]
    (-> this (.isActive))))

(defn set-name
  "name - `java.lang.String`"
  ([^NewWord this ^java.lang.String name]
    (-> this (.setName name))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NewWord this]
    (-> this (.toString))))

(defn update
  "更新发现权重,并且更新词性

  nature - `org.ansj.domain.Nature`
  freq - `int`"
  ([^NewWord this ^org.ansj.domain.Nature nature ^Integer freq]
    (-> this (.update nature freq))))

(defn get-all-freq
  "returns: `int`"
  (^Integer [^NewWord this]
    (-> this (.getAllFreq))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^NewWord this]
    (-> this (.getName))))

(defn set-score
  "score - `double`"
  ([^NewWord this ^Double score]
    (-> this (.setScore score))))

(defn get-nature
  "returns: `org.ansj.domain.Nature`"
  (^org.ansj.domain.Nature [^NewWord this]
    (-> this (.getNature))))

(defn get-score
  "returns: `double`"
  (^Double [^NewWord this]
    (-> this (.getScore))))

(defn set-nature
  "nature - `org.ansj.domain.Nature`"
  ([^NewWord this ^org.ansj.domain.Nature nature]
    (-> this (.setNature nature))))

(defn set-active
  "is-active - `boolean`"
  ([^NewWord this ^Boolean is-active]
    (-> this (.setActive is-active))))

