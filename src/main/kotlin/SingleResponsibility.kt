import kotlin.math.PI

// SRP means that a class has only one responsibility and can only have one reason to change //

class AreaCalculator{ // Class violating the Single Responsibility Principle


        fun areaofcircle(rad: Double): Double {
            var area = PI * rad * rad;
            return area
        }

        fun areaofsquare(len: Int): Int {
            var area = len * len;
            return area;
        }
    }


class Area(private val sq:Square,private val cr:Circle){ // class that follows Single Responsibility Principle
    var areaofcircle = cr.cirarea(5.14)
    var areaofsquare = sq.sqarea(2)
}




