(ns org.nd4j.linalg.util.MathUtils
  "This is a math jcuda.utils class."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.util MathUtils]))

(defn ->math-utils
  "Constructor."
  (^MathUtils []
    (new MathUtils )))

(def *-log-2
  "Static Constant.

  The natural logarithm of 2.

  type: double"
  MathUtils/log2)

(def *-small
  "Static Constant.

  The small deviation allowed in double comparisons.

  type: double"
  MathUtils/SMALL)

(defn *combination
  "This returns the combination of n choose r

  n - the number of elements overall - `double`
  r - the number of elements to choose - `double`

  returns: the amount of possible combinations for this applyTransformToDestination of elements - `double`"
  (^Double [^Double n ^Double r]
    (MathUtils/combination n r)))

(defn *discretize
  "Discretize the given value

  value - the value to discretize - `double`
  min - the min of the distribution - `double`
  max - the max of the distribution - `double`
  bin-count - the number of bins - `int`

  returns: the discretized value - `int`"
  (^Integer [^Double value ^Double min ^Double max ^Integer bin-count]
    (MathUtils/discretize value min max bin-count)))

(defn *bernoullis
  "This will return the bernoulli trial for the given event.
  A bernoulli trial is a mechanism for detecting the probability
  of a given event occurring k times in n independent trials

  n - the number of trials - `double`
  k - the number of times the target event occurs - `double`
  success-prob - the probability of the event happening - `double`

  returns: the probability of the given event occurring k times. - `double`"
  (^Double [^Double n ^Double k ^Double success-prob]
    (MathUtils/bernoullis n k success-prob)))

(defn *kronecker-delta
  "This returns the kronecker delta of two doubles.

  i - the first number to compare - `double`
  j - the second number to compare - `double`

  returns: 1 if they are equal, 0 otherwise - `int`"
  (^Integer [^Double i ^Double j]
    (MathUtils/kroneckerDelta i j)))

(defn *min
  "doubles - `double[]`

  returns: `double`"
  (^Double [doubles]
    (MathUtils/min doubles)))

(defn *coord-split
  "This returns the coordinate split in a list of coordinates
  such that the values for ret[0] are the x values
  and ret[1] are the y values

  vector - the vector to split with x and y values/ - `double[]`

  returns: a coordinate split for the given vector of values.
  if null, is passed in null is returned - `java.util.List<double[]>`"
  ([vector]
    (MathUtils/coordSplit vector)))

(defn *max-index
  "Returns index of maximum element in a given
  array of doubles. First maximum is returned.

  doubles - the array of doubles - `double[]`

  returns: the index of the maximum element - `int`"
  (^Integer [doubles]
    (MathUtils/maxIndex doubles)))

(defn *normalize
  "Normalize a value
  (val - min) / (max - min)

  val - value to normalize - `double`
  min - min value - `double`
  max - max value - `double`

  returns: the normalized value - `double`"
  (^Double [^Double val ^Double min ^Double max]
    (MathUtils/normalize val min max))
  ([doubles ^Double sum]
    (MathUtils/normalize doubles sum)))

(defn *ss-reg
  "How much of the variance is explained by the regression

  residuals - error - `double[]`
  target-attribute - data for target attribute - `double[]`

  returns: the sum squares of regression - `double`"
  (^Double [residuals target-attribute]
    (MathUtils/ssReg residuals target-attribute)))

(defn *string-similarity
  "Calculate string similarity with tfidf weights relative to each character
  frequency and how many times a character appears in a given string

  strings - the strings to calculate similarity for - `java.lang.String`

  returns: the cosine similarity between the strings - `double`"
  (^Double [^java.lang.String strings]
    (MathUtils/stringSimilarity strings)))

(defn *merge-coords
  "This will merge the coordinates of the given coordinate system.

  x - the x coordinates - `double[]`
  y - the y coordinates - `double[]`

  returns: a vector such that each (x,y) pair is at ret[i],ret[i+1] - `double[]`"
  ([x y]
    (MathUtils/mergeCoords x y)))

(defn *y-vals
  "This returns the odd indexed values for the given vector

  vector - the odd indexed values of rht egiven vector - `double[]`

  returns: the y values of the given vector - `double[]`"
  ([vector]
    (MathUtils/yVals vector)))

(defn *distance-finder-z-value
  "This will translate a vector in to an equivalent integer

  vector - the vector to translate - `double[]`

  returns: a z value such that the value is the interleaved lsd to msd for each
  double in the vector - `int`"
  (^Integer [vector]
    (MathUtils/distanceFinderZValue vector)))

(defn *from-string
  "This will take a given string and separator and convert it to an equivalent
  double array.

  data - the data to separate - `java.lang.String`
  separator - the separator to use - `java.lang.String`

  returns: the new double array based on the given data - `double[]`"
  ([^java.lang.String data ^java.lang.String separator]
    (MathUtils/fromString data separator)))

(defn *w-0
  "x - `double[]`
  y - `double[]`
  n - `int`

  returns: `double`"
  (^Double [x y ^Integer n]
    (MathUtils/w_0 x y n)))

(defn *mean
  "Computes the mean for an array of doubles.

  vector - the array - `double[]`

  returns: the mean - `double`"
  (^Double [vector]
    (MathUtils/mean vector)))

(defn *tfidf
  "Return td * idf

  td - the term frequency (assumed calculated) - `double`
  idf - inverse document frequency (assumed calculated) - `double`

  returns: td * idf - `double`"
  (^Double [^Double td ^Double idf]
    (MathUtils/tfidf td idf)))

(defn *to-decimal
  "This will convert the given binary string to a decimal based
  integer

  binary - the binary string to convert - `java.lang.String`

  returns: an equivalent base 10 number - `int`"
  (^Integer [^java.lang.String binary]
    (MathUtils/toDecimal binary)))

(defn *sum
  "This returns the sum of the given array.

  nums - the array of numbers to sum - `double[]`

  returns: the sum of the given array - `double`"
  (^Double [nums]
    (MathUtils/sum nums)))

(defn *round-float
  "Rounds a double to the given number of decimal places.

  value - the double value - `float`
  after-decimal-point - the number of digits after the decimal point - `int`

  returns: the double rounded to the given precision - `float`"
  (^Float [^Float value ^Integer after-decimal-point]
    (MathUtils/roundFloat value after-decimal-point)))

(defn *idf
  "Inverse document frequency: the total docs divided by the number of times the word
  appeared in a document

  total-docs - the total documents for the data applyTransformToDestination - `double`
  num-times-word-appeared-in-a-document - the number of times the word occurred in a document - `double`

  returns: log(10) (totalDocs/numTImesWordAppearedInADocument) - `double`"
  (^Double [^Double total-docs ^Double num-times-word-appeared-in-a-document]
    (MathUtils/idf total-docs num-times-word-appeared-in-a-document)))

(defn *w-1
  "x - `double[]`
  y - `double[]`
  n - `int`

  returns: `double`"
  (^Double [x y ^Integer n]
    (MathUtils/w_1 x y n)))

(defn *max
  "doubles - `double[]`

  returns: `double`"
  (^Double [doubles]
    (MathUtils/max doubles)))

(defn *sigmoid
  "1 / 1  exp(-x)

  x - `double`

  returns: `double`"
  (^Double [^Double x]
    (MathUtils/sigmoid x)))

(defn *pow
  "base - `double`
  exponent - `double`

  returns: `double`"
  (^Double [^Double base ^Double exponent]
    (MathUtils/pow base exponent)))

(defn *tf
  "Term frequency: 1+ log10(count)

  count - the count of a word or character in a given string or document - `int`

  returns: 1+ log(10) count - `double`"
  (^Double [^Integer count]
    (MathUtils/tf count)))

(defn *next-pow-of-2
  "See: http://stackoverflow.com/questions/466204/rounding-off-to-nearest-power-of-2

  v - the number to getFromOrigin the next power of 2 for - `long`

  returns: the next power of 2 for the passed in value - `long`"
  (^Long [^Long v]
    (MathUtils/nextPowOf2 v)))

(defn *random-double-between
  "begin - `double`
  end - `double`

  returns: `double`"
  (^Double [^Double begin ^Double end]
    (MathUtils/randomDoubleBetween begin end)))

(defn *determination-coefficient
  "This returns the determination coefficient of two vectors given a length

  y-1 - the first vector - `double[]`
  y-2 - the second vector - `double[]`
  n - the length of both vectors - `int`

  returns: the determination coefficient or r^2 - `double`"
  (^Double [y-1 y-2 ^Integer n]
    (MathUtils/determinationCoefficient y-1 y-2 n)))

(defn *uniform
  "Generate a uniform random number from the given rng

  rng - the rng to use - `java.util.Random`
  min - the min num - `double`
  max - the max num - `double`

  returns: a number uniformly distributed between min and max - `double`"
  (^Double [^java.util.Random rng ^Double min ^Double max]
    (MathUtils/uniform rng min max)))

(defn *times
  "This returns the product of all numbers in the given array.

  nums - the numbers to multiply over - `double[]`

  returns: the product of all numbers in the array, or 0
  if the length is or or nums i null - `double`"
  (^Double [nums]
    (MathUtils/times nums)))

(defn *random-float-between
  "begin - `float`
  end - `float`

  returns: `float`"
  (^Float [^Float begin ^Float end]
    (MathUtils/randomFloatBetween begin end)))

(defn *permutation
  "This returns the permutation of n choose r.

  n - the n to choose - `double`
  r - the number of elements to choose - `double`

  returns: the permutation of these numbers - `double`"
  (^Double [^Double n ^Double r]
    (MathUtils/permutation n r)))

(defn *adjustedr-squared
  "This calculates the adjusted r^2 including degrees of freedom.
  Also known as calculating \"strength\" of a regression

  r-squared - the r squared value to calculate - `double`
  num-regressors - number of variables - `int`
  num-data-points - size of the data applyTransformToDestination - `int`

  returns: an adjusted r^2 for degrees of freedom - `double`"
  (^Double [^Double r-squared ^Integer num-regressors ^Integer num-data-points]
    (MathUtils/adjustedrSquared r-squared num-regressors num-data-points)))

(defn *sum-of-squares
  "This returns the sum of squares for the given vector.

  vector - the vector to obtain the sum of squares for - `double[]`

  returns: the sum of squares for this vector - `double`"
  (^Double [vector]
    (MathUtils/sumOfSquares vector)))

(defn *sum-of-mean-differences
  "Used for calculating top part of simple regression for
  beta 1

  vector - the x coordinates - `double[]`
  vector-2 - the y coordinates - `double[]`

  returns: the sum of mean differences for the input vectors - `double`"
  (^Double [vector vector-2]
    (MathUtils/sumOfMeanDifferences vector vector-2)))

(defn *error-for
  "actual - `double`
  prediction - `double`

  returns: `double`"
  (^Double [^Double actual ^Double prediction]
    (MathUtils/errorFor actual prediction)))

(defn *shuffle-array
  "array - `int[]`
  rng-seed - `long`"
  ([array ^Long rng-seed]
    (MathUtils/shuffleArray array rng-seed)))

(defn *entropy
  "This returns the entropy (information gain, or uncertainty of a random variable): -sum(x*log(x))

  vector - the vector of values to getFromOrigin the entropy for - `double[]`

  returns: the entropy of the given vector - `double`"
  (^Double [vector]
    (MathUtils/entropy vector)))

(defn *clamp
  "Clamps the value to a discrete value

  value - the value to clamp - `int`
  min - min for the probability distribution - `int`
  max - max for the probability distribution - `int`

  returns: the discrete value - `int`"
  (^Integer [^Integer value ^Integer min ^Integer max]
    (MathUtils/clamp value min max)))

(defn *generate-uniform
  "This will generate a series of uniformally distributed
  numbers between l times

  l - the number of numbers to generate - `int`

  returns: l uniformally generated numbers - `double[]`"
  ([^Integer l]
    (MathUtils/generateUniform l)))

(defn *factorial
  "This will return the factorial of the given number n.

  n - the number to getFromOrigin the factorial for - `double`

  returns: the factorial for this number - `double`"
  (^Double [^Double n]
    (MathUtils/factorial n)))

(defn *sample-doubles-in-interval
  "doubles - `double[][]`
  l - `int`

  returns: `double[]`"
  ([doubles ^Integer l]
    (MathUtils/sampleDoublesInInterval doubles l)))

(defn *partition-variable
  "This will partition the given whole variable data applyTransformToDestination in to the specified chunk number.

  arr - the data applyTransformToDestination to pass in - `java.util.List`
  chunk - the number to separate by - `int`

  returns: a partition data applyTransformToDestination relative to the passed in chunk number - `java.util.List<java.util.List<java.lang.Double>>`"
  (^java.util.List [^java.util.List arr ^Integer chunk]
    (MathUtils/partitionVariable arr chunk)))

(defn *ss-total
  "Total variance in target attribute

  residuals - error - `double[]`
  target-attribute - data for target attribute - `double[]`

  returns: Total variance in target attribute - `double`"
  (^Double [residuals target-attribute]
    (MathUtils/ssTotal residuals target-attribute)))

(defn *sum-of-mean-differences-one-point
  "Used for calculating top part of simple regression for
  beta 1

  vector - the x coordinates - `double[]`

  returns: the sum of mean differences for the input vectors - `double`"
  (^Double [vector]
    (MathUtils/sumOfMeanDifferencesOnePoint vector)))

(defn *prob-to-log-odds
  "Returns the log-odds for a given probability.

  prob - the probability - `double`

  returns: the log-odds after the probability has been mapped to
  [Utils.SMALL, 1-Utils.SMALL] - `double`"
  (^Double [^Double prob]
    (MathUtils/probToLogOdds prob)))

(defn *prob-round
  "Rounds a double to the next nearest integer value in a probabilistic
  fashion (e.g. 0.8 has a 20% chance of being rounded down to 0 and a
  80% chance of being rounded up to 1). In the limit, the average of
  the rounded numbers generated by this procedure should converge to
  the original double.

  value - the double value - `double`
  rand - the random number generator - `java.util.Random`

  returns: the resulting integer value - `int`"
  (^Integer [^Double value ^java.util.Random rand]
    (MathUtils/probRound value rand)))

(defn *gr
  "Tests if a is greater than b.

  a - a double - `double`
  b - a double - `double`

  returns: `boolean`"
  (^Boolean [^Double a ^Double b]
    (MathUtils/gr a b)))

(defn *round-double
  "Rounds a double to the given number of decimal places.

  value - the double value - `double`
  after-decimal-point - the number of digits after the decimal point - `int`

  returns: the double rounded to the given precision - `double`"
  (^Double [^Double value ^Integer after-decimal-point]
    (MathUtils/roundDouble value after-decimal-point)))

(defn *ss-error
  "How much of the variance is NOT explained by the regression

  predicted-values - predicted values - `double[]`
  target-attribute - data for target attribute - `double[]`

  returns: the sum squares of regression - `double`"
  (^Double [predicted-values target-attribute]
    (MathUtils/ssError predicted-values target-attribute)))

(defn *hypotenuse
  "sqrt(a^2  b^2) without under/overflow.

  a - `double`
  b - `double`

  returns: `double`"
  (^Double [^Double a ^Double b]
    (MathUtils/hypotenuse a b)))

(defn *hash-code
  "hashCode method, taken from Java 1.8 Double.hashCode(double) method

  value - Double value to hash - `double`

  returns: Hash code for the double value - `int`"
  (^Integer [^Double value]
    (MathUtils/hashCode value)))

(defn *root-means-squared-error
  "This returns the root mean squared error of two data sets

  real - the realComponent values - `double[]`
  predicted - the predicted values - `double[]`

  returns: the root means squared error for two data sets - `double`"
  (^Double [real predicted]
    (MathUtils/rootMeansSquaredError real predicted)))

(defn *correlation
  "Returns the correlation coefficient of two double vectors.

  residuals - residuals - `double[]`
  target-attribute - target attribute vector - `double[]`

  returns: the correlation coefficient or r - `double`"
  (^Double [residuals target-attribute]
    (MathUtils/correlation residuals target-attribute)))

(defn *vector-length
  "Returns the vector length (sqrt(sum(x_i))

  vector - the vector to return the vector length for - `double[]`

  returns: the vector length of the passed in array - `double`"
  (^Double [vector]
    (MathUtils/vectorLength vector)))

(defn *information
  "This returns the entropy for a given vector of probabilities.

  probabilities - the probabilities to getFromOrigin the entropy for - `double[]`

  returns: the entropy of the given probabilities. - `double`"
  (^Double [probabilities]
    (MathUtils/information probabilities)))

(defn *logs-2probs
  "Converts an array containing the natural logarithms of
  probabilities stored in a vector back into probabilities.
  The probabilities are assumed to sum to one.

  a - an array holding the natural logarithms of the probabilities - `double[]`

  returns: the converted array - `double[]`"
  ([a]
    (MathUtils/logs2probs a)))

(defn *weights-for
  "This returns the minimized loss values for a given vector.
  It is assumed that the x, y pairs are at
  vector[i], vector[i+1]

  vector - the vector of numbers to getFromOrigin the weights for - `java.util.List`

  returns: a double array with w_0 and w_1 are the associated indices. - `double[]`"
  ([^java.util.List vector]
    (MathUtils/weightsFor vector)))

(defn *random-number-between
  "Generates a random integer between the specified numbers

  begin - the begin of the interval - `double`
  end - the end of the interval - `double`
  anchor - the base number (assuming to be generated from an external rng) - `double`

  returns: an int between begin and end - `int`"
  (^Integer [^Double begin ^Double end ^Double anchor]
    (MathUtils/randomNumberBetween begin end anchor))
  (^Integer [^Double begin ^Double end]
    (MathUtils/randomNumberBetween begin end)))

(defn *normalize-to-one
  "doubles - `double[]`

  returns: `double[]`"
  ([doubles]
    (MathUtils/normalizeToOne doubles)))

(defn *round
  "Rounds a double to the next nearest integer value. The JDK version
  of it doesn't work properly.

  value - the double value - `double`

  returns: the resulting integer value - `int`"
  (^Integer [^Double value]
    (MathUtils/round value)))

(defn *sm
  "Tests if a is smaller than b.

  a - a double - `double`
  b - a double - `double`

  returns: `boolean`"
  (^Boolean [^Double a ^Double b]
    (MathUtils/sm a b)))

(defn *manhattan-distance
  "This will calculate the Manhattan distance between two sets of points.
  The Manhattan distance is equivalent to:
  1_sum_n |p_i - q_i|

  p - the first point vector - `double[]`
  q - the second point vector - `double[]`

  returns: the Manhattan distance between two object - `double`"
  (^Double [p q]
    (MathUtils/manhattanDistance p q)))

(defn *sum-of-products
  "This returns the sum of products for the given
  numbers.

  nums - the sum of products for the give numbers - `double[]`

  returns: the sum of products for the given numbers - `double`"
  (^Double [nums]
    (MathUtils/sumOfProducts nums)))

(defn *log-2
  "Returns the logarithm of a for base 2.

  a - a double - `double`

  returns: the logarithm for base 2 - `double`"
  (^Double [^Double a]
    (MathUtils/log2 a)))

(defn *x-vals
  "This returns the x values of the given vector.
  These are assumed to be the even values of the vector.

  vector - the vector to getFromOrigin the values for - `double[]`

  returns: the x values of the given vector - `double[]`"
  ([vector]
    (MathUtils/xVals vector)))

(defn *squared-loss
  "This will return the squared loss of the given
  points

  x - the x coordinates to use - `double[]`
  y - the y coordinates to use - `double[]`
  w-0 - the first weight - `double`
  w-1 - the second weight - `double`

  returns: the squared loss of the given points - `double`"
  (^Double [x y ^Double w-0 ^Double w-1]
    (MathUtils/squaredLoss x y w-0 w-1)))

(defn *binomial
  "Generates a binomial distributed number using
  the given rng

  rng - `org.apache.commons.math3.random.RandomGenerator`
  n - `int`
  p - `double`

  returns: `int`"
  (^Integer [^org.apache.commons.math3.random.RandomGenerator rng ^Integer n ^Double p]
    (MathUtils/binomial rng n p)))

(defn *euclidean-distance
  "This returns the euclidean distance of two vectors
  sum(i=1,n) (q_i - p_i)^2

  p - the first vector - `double[]`
  q - the second vector - `double[]`

  returns: the euclidean distance between two vectors - `double`"
  (^Double [p q]
    (MathUtils/euclideanDistance p q)))

(defn slope
  "This returns the slope of the given points.

  x-1 - the first x to use - `double`
  x-2 - the end x to use - `double`
  y-1 - the begin y to use - `double`
  y-2 - the end y to use - `double`

  returns: the slope of the given points - `double`"
  (^Double [^MathUtils this ^Double x-1 ^Double x-2 ^Double y-1 ^Double y-2]
    (-> this (.slope x-1 x-2 y-1 y-2))))

