(ns org.ansj.domain.Term
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.domain Term]))

(defn ->term
  "Constructor.

  name - `java.lang.String`
  offe - `int`
  nature-str - `java.lang.String`
  nature-freq - `int`"
  (^Term [^java.lang.String name ^Integer offe ^java.lang.String nature-str ^Integer nature-freq]
    (new Term name offe nature-str nature-freq))
  (^Term [^java.lang.String name ^Integer offe ^org.ansj.domain.AnsjItem item]
    (new Term name offe item)))

(defn update-offe
  "更新偏移量

  offe - `int`"
  ([^Term this ^Integer offe]
    (-> this (.updateOffe offe))))

(defn get-sub-term
  "returns: `java.util.List<org.ansj.domain.Term>`"
  (^java.util.List [^Term this]
    (-> this (.getSubTerm))))

(defn set-to
  "to - `org.ansj.domain.Term`"
  ([^Term this ^org.ansj.domain.Term to]
    (-> this (.setTo to))))

(defn score
  "score - `double`"
  ([^Term this ^Double score]
    (-> this (.score score)))
  (^Double [^Term this]
    (-> this (.score))))

(defn to-value
  "returns: `int`"
  (^Integer [^Term this]
    (-> this (.toValue))))

(defn next
  "returns: `org.ansj.domain.Term`"
  (^org.ansj.domain.Term [^Term this]
    (-> this (.next))))

(defn set-path-self-score
  "核心分数的最优的路径,越小越好

  from - `org.ansj.domain.Term`"
  ([^Term this ^org.ansj.domain.Term from]
    (-> this (.setPathSelfScore from))))

(defn get-nature-str
  "returns: `java.lang.String`"
  (^java.lang.String [^Term this]
    (-> this (.getNatureStr))))

(defn set-sub-term
  "sub-term - `java.util.List`"
  ([^Term this ^java.util.List sub-term]
    (-> this (.setSubTerm sub-term))))

(defn natrue
  "获得这个词的词性.词性计算后才可生效

  returns: `org.ansj.domain.Nature`"
  (^org.ansj.domain.Nature [^Term this]
    (-> this (.natrue))))

(defn self-score
  "self-score - `double`"
  ([^Term this ^Double self-score]
    (-> this (.selfScore self-score)))
  (^Double [^Term this]
    (-> this (.selfScore))))

(defn set-name
  "name - `java.lang.String`"
  ([^Term this ^java.lang.String name]
    (-> this (.setName name))))

(defn set-from
  "from - `org.ansj.domain.Term`"
  ([^Term this ^org.ansj.domain.Term from]
    (-> this (.setFrom from))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Term this]
    (-> this (.toString))))

(defn set-path-score
  "核心构建最优的路径

  from - `org.ansj.domain.Term`
  relation-map - `java.util.Map`"
  ([^Term this ^org.ansj.domain.Term from ^java.util.Map relation-map]
    (-> this (.setPathScore from relation-map))))

(defn set-next
  "返回他自己

  next - 设置他的下一个 - `org.ansj.domain.Term`

  returns: `org.ansj.domain.Term`"
  (^org.ansj.domain.Term [^Term this ^org.ansj.domain.Term next]
    (-> this (.setNext next))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^Term this]
    (-> this (.getName))))

(defn get-real-name
  "returns: `java.lang.String`"
  (^java.lang.String [^Term this]
    (-> this (.getRealName))))

(defn new-word?
  "returns: `boolean`"
  (^Boolean [^Term this]
    (-> this (.isNewWord))))

(defn item
  "returns: `org.ansj.domain.AnsjItem`"
  (^org.ansj.domain.AnsjItem [^Term this]
    (-> this (.item))))

(defn set-synonyms
  "synonyms - `java.util.List`"
  ([^Term this ^java.util.List synonyms]
    (-> this (.setSynonyms synonyms))))

(defn merage-with-blank
  "进行term合并,能合并空白字符

  to - `org.ansj.domain.Term`

  returns: `org.ansj.domain.Term`"
  (^org.ansj.domain.Term [^Term this ^org.ansj.domain.Term to]
    (-> this (.merageWithBlank to))))

(defn set-nature
  "nature - `org.ansj.domain.Nature`"
  ([^Term this ^org.ansj.domain.Nature nature]
    (-> this (.setNature nature))))

(defn get-synonyms
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Term this]
    (-> this (.getSynonyms))))

(defn from
  "returns: `org.ansj.domain.Term`"
  (^org.ansj.domain.Term [^Term this]
    (-> this (.from))))

(defn merage
  "进行term合并

  to - `org.ansj.domain.Term`

  returns: `org.ansj.domain.Term`"
  (^org.ansj.domain.Term [^Term this ^org.ansj.domain.Term to]
    (-> this (.merage to))))

(defn set-real-name
  "real-name - `java.lang.String`"
  ([^Term this ^java.lang.String real-name]
    (-> this (.setRealName real-name))))

(defn term-natures
  "获得这个term的所有词性

  returns: `org.ansj.domain.TermNatures`"
  (^org.ansj.domain.TermNatures [^Term this]
    (-> this (.termNatures))))

(defn update-term-natures-and-nature
  "term-natures - `org.ansj.domain.TermNatures`"
  ([^Term this ^org.ansj.domain.TermNatures term-natures]
    (-> this (.updateTermNaturesAndNature term-natures))))

(defn to
  "returns: `org.ansj.domain.Term`"
  (^org.ansj.domain.Term [^Term this]
    (-> this (.to))))

(defn set-new-word
  "new-word - `boolean`"
  ([^Term this ^Boolean new-word]
    (-> this (.setNewWord new-word))))

(defn clear-score
  "将term的所有分数置为0"
  ([^Term this]
    (-> this (.clearScore))))

(defn set-offe
  "offe - `int`"
  ([^Term this ^Integer offe]
    (-> this (.setOffe offe))))

(defn get-offe
  "returns: `int`"
  (^Integer [^Term this]
    (-> this (.getOffe))))

