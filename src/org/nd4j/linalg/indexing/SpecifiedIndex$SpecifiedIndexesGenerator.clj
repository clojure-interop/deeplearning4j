(ns org.nd4j.linalg.indexing.SpecifiedIndex$SpecifiedIndexesGenerator
  "A generator for SpecifiedIndex for
 Itertools.product(Generator)
 to iterate
 over an array given a set of iterators"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.indexing SpecifiedIndex$SpecifiedIndexesGenerator]))

(defn ->specified-indexes-generator
  "Constructor.

  The indexes to generate from

  indexes - the indexes to generate from - `org.nd4j.linalg.indexing.INDArrayIndex[]`"
  (^SpecifiedIndex$SpecifiedIndexesGenerator [indexes]
    (new SpecifiedIndex$SpecifiedIndexesGenerator indexes)))

(defn next
  "returns: `net.ericaro.neoitertools.Generator<java.util.List<java.lang.Long>>`

  throws: java.util.NoSuchElementException"
  (^net.ericaro.neoitertools.Generator [^SpecifiedIndex$SpecifiedIndexesGenerator this]
    (-> this (.next))))

