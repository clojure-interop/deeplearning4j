(ns org.nd4j.linalg.primitives.CounterMap
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.primitives CounterMap]))

(defn ->counter-map
  "Constructor."
  (^CounterMap []
    (new CounterMap )))

(defn get-count
  "This method returns counts for a given first/second pair

  first - `F`
  second - `S`

  returns: `double`"
  (^Double [^CounterMap this first second]
    (-> this (.getCount first second))))

(defn increment-count
  "This method will increment counts for a given first/second pair

  first - `F`
  second - `S`
  inc - `double`"
  ([^CounterMap this first second ^Double inc]
    (-> this (.incrementCount first second inc))))

(defn get-iterator
  "This method returns Iterator of all first/second pairs stored in this counter

  returns: `java.util.Iterator<org.nd4j.linalg.primitives.Pair<F,S>>`"
  (^java.util.Iterator [^CounterMap this]
    (-> this (.getIterator))))

(defn set-count
  "This method allows you to set counter value for a given first/second pair

  first - `F`
  second - `S`
  value - `double`

  returns: `double`"
  (^Double [^CounterMap this first second ^Double value]
    (-> this (.setCount first second value))))

(defn get-counter
  "This method returns counter for a given first element

  first - `F`

  returns: `org.nd4j.linalg.primitives.Counter<S>`"
  (^org.nd4j.linalg.primitives.Counter [^CounterMap this first]
    (-> this (.getCounter first))))

(defn key-set
  "This method returns Set of all first elements

  returns: `java.util.Set<F>`"
  (^java.util.Set [^CounterMap this]
    (-> this (.keySet))))

(defn arg-max
  "This method returns pair of elements with a max value

  returns: `org.nd4j.linalg.primitives.Pair<F,S>`"
  (^org.nd4j.linalg.primitives.Pair [^CounterMap this]
    (-> this (.argMax))))

(defn increment-all
  "This method will increment values of this counter, by counts of other counter

  other - `org.nd4j.linalg.primitives.CounterMap`"
  ([^CounterMap this ^org.nd4j.linalg.primitives.CounterMap other]
    (-> this (.incrementAll other))))

(defn empty?
  "This method checks if this CounterMap has any values stored for a given first element

  element - `F`

  returns: `boolean`"
  (^Boolean [^CounterMap this element]
    (-> this (.isEmpty element)))
  (^Boolean [^CounterMap this]
    (-> this (.isEmpty))))

(defn size
  "This method returns number of First elements in this CounterMap

  returns: `int`"
  (^Integer [^CounterMap this]
    (-> this (.size))))

(defn clear
  "This method purges counter for a given first element

  element - `F`"
  ([^CounterMap this element]
    (-> this (.clear element)))
  ([^CounterMap this]
    (-> this (.clear))))

(defn total-size
  "This method returns total number of elements in this CounterMap

  returns: `int`"
  (^Integer [^CounterMap this]
    (-> this (.totalSize))))

