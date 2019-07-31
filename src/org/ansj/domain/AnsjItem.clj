(ns org.ansj.domain.AnsjItem
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.domain AnsjItem]))

(defn ->ansj-item
  "Constructor."
  (^AnsjItem []
    (new AnsjItem )))

(def *-null
  "Static Constant.

  type: org.ansj.domain.AnsjItem"
  AnsjItem/NULL)

(def *-begin
  "Static Constant.

  type: org.ansj.domain.AnsjItem"
  AnsjItem/BEGIN)

(def *-end
  "Static Constant.

  type: org.ansj.domain.AnsjItem"
  AnsjItem/END)

(defn param
  "Instance Field.

  type: java.lang.String"
  (^java.lang.String [^AnsjItem this]
    (-> this .-param)))

(defn term-natures
  "Instance Field.

  frequency : 词性词典,以及词性的相关权重

  type: org.ansj.domain.TermNatures"
  (^org.ansj.domain.TermNatures [^AnsjItem this]
    (-> this .-termNatures)))

(defn bigram-entry-map
  "Instance Field.

  type: java.util.Map<java.lang.Integer,java.lang.Integer>"
  (^java.util.Map [^AnsjItem this]
    (-> this .-bigramEntryMap)))

(defn init
  "split - `java.lang.String[]`"
  ([^AnsjItem this split]
    (-> this (.init split))))

(defn init-value
  "split - `java.lang.String[]`"
  ([^AnsjItem this split]
    (-> this (.initValue split))))

(defn to-text
  "returns: `java.lang.String`"
  (^java.lang.String [^AnsjItem this]
    (-> this (.toText))))

