(ns org.nd4j.linalg.io.CollectionUtils
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.io CollectionUtils]))

(defn ->collection-utils
  "Constructor."
  (^CollectionUtils []
    (new CollectionUtils )))

(defn *merge-properties-into-map
  "props - `java.util.Properties`
  map - `java.util.Map`"
  ([^java.util.Properties props ^java.util.Map map]
    (CollectionUtils/mergePropertiesIntoMap props map)))

(defn *find-common-element-type
  "collection - `java.util.Collection`

  returns: `java.lang.Class<?>`"
  (^java.lang.Class [^java.util.Collection collection]
    (CollectionUtils/findCommonElementType collection)))

(defn *contains
  "iterator - `java.util.Iterator`
  element - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^java.util.Iterator iterator ^java.lang.Object element]
    (CollectionUtils/contains iterator element)))

(defn *contains-any
  "source - `java.util.Collection`
  candidates - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^java.util.Collection source ^java.util.Collection candidates]
    (CollectionUtils/containsAny source candidates)))

(defn *array-to-list
  "source - `java.lang.Object`

  returns: `java.util.List`"
  (^java.util.List [^java.lang.Object source]
    (CollectionUtils/arrayToList source)))

(defn *merge-array-into-collection
  "array - `java.lang.Object`
  collection - `java.util.Collection`"
  ([^java.lang.Object array ^java.util.Collection collection]
    (CollectionUtils/mergeArrayIntoCollection array collection)))

(defn *find-first-match
  "source - `java.util.Collection`
  candidates - `java.util.Collection`

  returns: `java.lang.Object`"
  (^java.lang.Object [^java.util.Collection source ^java.util.Collection candidates]
    (CollectionUtils/findFirstMatch source candidates)))

(defn *find-value-of-type
  "collection - `java.util.Collection`
  type - `java.lang.Class`

  returns: `<T> T`"
  ([^java.util.Collection collection ^java.lang.Class type]
    (CollectionUtils/findValueOfType collection type)))

(defn *unmodifiable-multi-value-map
  "map - `org.nd4j.linalg.util.MultiValueMap`

  returns: `<K,V> org.nd4j.linalg.util.MultiValueMap<K,V>`"
  ([^org.nd4j.linalg.util.MultiValueMap map]
    (CollectionUtils/unmodifiableMultiValueMap map)))

(defn *to-multi-value-map
  "map - `java.util.Map`

  returns: `<K,V> org.nd4j.linalg.util.MultiValueMap<K,V>`"
  ([^java.util.Map map]
    (CollectionUtils/toMultiValueMap map)))

(defn *to-iterator
  "enumeration - `java.util.Enumeration`

  returns: `<E> java.util.Iterator<E>`"
  ([^java.util.Enumeration enumeration]
    (CollectionUtils/toIterator enumeration)))

(defn *contains-instance
  "collection - `java.util.Collection`
  element - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^java.util.Collection collection ^java.lang.Object element]
    (CollectionUtils/containsInstance collection element)))

(defn *empty?
  "collection - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^java.util.Collection collection]
    (CollectionUtils/isEmpty collection)))

(defn *has-unique-object?
  "collection - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^java.util.Collection collection]
    (CollectionUtils/hasUniqueObject collection)))

(defn *to-array
  "enumeration - `java.util.Enumeration`
  array - `A[]`

  returns: `<A,E extends A> A[]`"
  ([^java.util.Enumeration enumeration array]
    (CollectionUtils/toArray enumeration array)))

