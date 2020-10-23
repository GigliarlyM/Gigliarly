package pg.pro.gimo
import pg.pro.gimo.Delta


println "Informe-me alguns dados(Preencha os espaços abaixo)! "
println()
println "Quem é..."
print "A: "
def a = System.in.newReader().readLine() as Double
print "B: "
def b = System.in.newReader().readLine() as Double
print "C: "
def c = System.in.newReader().readLine() as Double

println "na função F(x)= ${a}x² + ${b}x + ${c}"

// deve resolver essa função quadrática apartir de Y
print "Qual é o valor, que você vai infotmar(Y ou X)? "
def ben = System.in.newReader().readLine()

if (ben == 'y') {
    print "Qual é o valor de Y ( F(X) )? "
    def y = System.in.newReader().readLine()
    println "${y} = ${a}x² + ${b}x + ${c}"

    def delta = b * b - 4*a*c
    println "Delta é ${delta}"

    def zel = Delta(delta)

    println(zel)

}
