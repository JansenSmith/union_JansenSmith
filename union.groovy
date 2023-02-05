double size =40;
CSG cube = new Cube(	size,// X dimention
			size,// Y dimention
			size//  Z dimention
			).toCSG()
//create a sphere
CSG sphere = new Sphere(size/20*12.5).toCSG()
// perform a union
CSG cubePlusSphere = cube.union(sphere);

//To union a list of CSG's together use the static unionAll
CSG allUnion = CSG.unionAll([cubePlusSphere , cube.movex(size*1.5), sphere.movey(size*1.5)])

return allUnion