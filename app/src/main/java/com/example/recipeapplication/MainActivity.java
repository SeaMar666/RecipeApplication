package com.example.recipeapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.LabeledIntent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView myRecyclerView;
    ListAdapter myAdapter;

    List<Recipes> recipes1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recipes1 = new ArrayList<>();
        recipes1.add(new Recipes("Vension(Deer) Steak","•\t1 ½ cups extra-virgin olive oil\n" +
                "•\t¾ cup soy sauce\n" +
                "•\t½ cup red wine vinegar\n" +
                "•\t½ cup freshly squeezed lemon juice\n" +
                "•\t¼ cup Worcestershire sauce\n" +
                "•\t2 garlic cloves, peeled and crushed\n" +
                "•\t1 ½ teaspoons roughly chopped fresh parsley\n" +
                "•\t2 tablespoons dry mustard\n" +
                "•\t2 ¼ teaspoons kosher salt, plus more as needed\n" +
                "•\t1 teaspoon black pepper, plus more as needed\n" +
                "•\t2 pounds venison loin or leg, cut into 6 steaks\n","Method:",
                "1.\tCombine all ingredients except venison in a large bowl. Submerge venison in the marinade, cover with plastic wrap and refrigerate at least 8 hours and up to 12 hours.\n" +
                        "2.\tHeat broiler, stovetop grill pan or grill. Remove venison from marinade and season with salt and pepper. Working in batches if necessary, place steaks under the broiler or on the grilling surface and cook, flipping once, until medium-rare, 4 to 5 minutes per side. Allow venison to rest for 5 minutes before serving.\n",R.drawable.steak,"Meat"));

        recipes1.add(new Recipes("Hamburger Steak with Onion Gravy","1 pound ground sirloin\n" +
                " ½ teaspoon salt, divided\n" +
                "•\t ½ teaspoon freshly ground black pepper, divided\n" +
                "•\t 1 tablespoon canola oil, divided\n" +
                "•\t 1 ½ cups vertically sliced onion\n" +
                "•\t 2 teaspoons all-purpose flour\n" +
                "•\t 1 cup unsalted beef stock\n" +
                "•\t 2 tablespoons thinly sliced green onions (optional)\n" +
                "•\t Quick Chive Mashed Potatoes\n" +
                "•\t Smoky Haricots Verts and Mushrooms\n","Method:","Divide beef into 4 equal portions, shaping each into a 1/2-inch-thick patty. Sprinkle patties evenly with 1/4 teaspoon salt and 1/4 teaspoon pepper. Heat 2 teaspoons oil in a large skillet over medium-high heat; swirl to coat. Add patties; cook 3 minutes on each side or until browned; remove from pan.\n" +
                "•\t Step 2\n" +
                "Add remaining 1 teaspoon oil to pan; swirl to coat. Add vertically sliced onion; sauté 3 minutes or until lightly browned and tender. Sprinkle onion with flour; cook 30 seconds, stirring constantly. Add stock and remaining salt and pepper; bring to a boil. Return patties to pan; reduce heat to medium, partially cover, and cook 5 minutes or until gravy is slightly thickened. " +
                "Sprinkle with green onions, if desired.\n",R.drawable.hamburger_steak_with_onion_gravy,"Meat"));

        recipes1.add(new Recipes("Chicken Teriyaki(Pan Fried)","•\t340 grams boneless skin-on chicken thighs\n" +
                "•\t1 teaspoon fresh ginger (grated)\n" +
                "•\t1/4 teaspoon salt\n" +
                "•\t2 teaspoons vegetable oil\n" +
                "•\t1 tablespoon honey\n" +
                "•\t1 tablespoon mirin\n" +
                "•\t1 tablespoon sake\n" +
                "•\t1 tablespoon soy sauce\n" +
                "•\t1 tablespoon sake\n","Method:",
                "1.\tRub the ginger and and salt into the chicken and let this sit for at least 30 minutes. After it's marinated, use paper towels to dry the chicken as best you can, removing any excess ginger pulp.\n" +
                        "2.\tHeat the oil in a heavy bottomed frying pan over medium heat. You don't want to start the chicken off over too high a heat otherwise it will not cook through before burning. Place the chicken skin-side down in the pan and fry until golden brown on one side.\n" +
                        "3.\tFlip the chicken, then add 1 tablespoon of sake and quickly cover the pan with a lid. Steam the chicken until it is just cooked through (about 5 minutes).\n" +
                        "4.\tPrepare the teriyaki sauce by mixing 1 tablespoon each of: honey, mirin, sake, and soy sauce. Stir to combine.\n" +
                        "5.\tRemove the lid, and drain any remaining liquid and oil. Use a paper towel to sop up any excess oil.\n" +
                        "6.\tTurn up the heat to high, then add the teriyaki sauce. Let this mixture boil, while flipping the chicken repeatedly to coat evenly.\n" +
                        "7.\tThe chicken teriyaki is done when most of the liquid has evaporated and the sauce forms a thick glaze around the chicken. Slice and pour the remaining teriyaki sauce over the chicken.\n",R.drawable.recipeteriyaki_chicken_recipe,"Chicken"));
        recipes1.add(new Recipes("Sticky Miso Peppers","•\t1 x 220 g tin of pineapple rings in juice\n" +
                "•\t280 g extra firm tofu\n" +
                "•\t2 mixed-colour peppers\n" +
                "•\tolive oil\n" +
                "•\t4 spring onions\n" +
                "•\t4 cloves of garlic\n" +
                "•\t90 g rice vermicelli noodles\n" +
                "•\t20 g wasabi peas\n" +
                "•\t2 heaped teaspoons red miso paste\n","Method:",
                "1.\tPlace the pineapple rings (reserving the juice) in a large dry non-stick frying pan on a medium heat.\n" +
                        "2.\tCut the tofu into four chunks and add to the pan. Let it all gently char for 4 minutes, then turn, char on the other side and remove, leaving the pan on the heat.\n" +
                        "3.\tDeseed the peppers, chop into 2cm chunks and place in the pan with ½ a tablespoon of olive oil, then reduce to a medium-low heat. Trim the spring onions, chop the white halves into 2cm lengths and add to the pan, reserving the green tops. Peel, finely slice and add the garlic, then cook it all for 10 minutes, or until soft and charred, stirring regularly.\n" +
                        "4.\tMeanwhile, finely slice the green halves of the spring onions. In a heatproof bowl, cover the noodles with boiling kettle water. In a pestle and mortar, pound the wasabi peas until fine.\n" +
                        "5.\tMix the miso paste into the reserved pineapple juice, then pour into the pepper pan with a splash of water. Let it sizzle for a minute, then return the tofu and pineapple to the pan to glaze.\n" +
                        "6.\tDrain the noodles, divide between your plates and spoon over the sticky miso peppers, followed by the tofu and pineapple. Sprinkle with the sliced green spring onion and crushed wasabi peas, then tuck right in.\n",R.drawable.sticky_miso,"Vegan"));
        recipes1.add(new Recipes("Sweet Hot Fried Chicken and Waffles","Waffles:\n" +
                " 2 cups all-purpose flour\n" +
                " 1 cup shredded sharp Cheddar\n" +
                " 2 tablespoons sugar \n" +
                " 2 teaspoons baking powder \n" +
                " 3 to 4 scallions, chopped, whites and greens separated\n" +
                " 7 to 8 dashes hot sauce\n" +
                " 2 teaspoons kosher salt, plus a pinch\n" +
                " 2 large eggs\n" +
                " 2 cups whole milk\n" +
                " 8 tablespoons (1 stick) unsalted butter, melted\n" +
                " Nonstick cooking spray, for the waffle iron\n" +
                "Fried Chicken:\n" +
                " Vegetable or canola oil, for frying\n" +
                " 8 boneless, skin-on chicken thighs \n" +
                " 1 cup buttermilk \n" +
                " 2 cups all-purpose flour \n" +
                " 1 teaspoon garlic powder \n" +
                " 1 teaspoon onion powder \n" +
                " 1 teaspoon paprika \n" +
                " 1 teaspoon ground black pepper \n" +
                " 1 1/2 teaspoons kosher salt, plus more for seasoning\n" +
                "½ tsp garam masala","Method:",
                "1.\tFor the waffles: Preheat the oven to 250 degrees F and place a rack in the middle of the oven. Place a baking sheet fitted with a wire rack in the oven.\n" +
                        "2.\tWhisk together the flour, Cheddar, sugar, baking powder, hot sauce, scallion whites and salt in a large bowl and set aside.\n" +
                        "3.\tIn another large bowl, whisk the eggs and a pinch of salt until just broken up, then add the milk and whisk. Pour in the melted butter and whisk until combined. \n" +
                        "4.\tAdd the wet ingredients to the dry ingredients and stir with a rubber spatula until the flour is just incorporated and no streaks remain (the batter may have a few lumps).\n" +
                        "5.\tPreheat a Belgian waffle iron to medium heat according to the manufacturer's instructions. Spray with nonstick cooking spray, add some batter, close the lid, and cook until the steam starts to diminish (open the top and peek for doneness after a few minutes). Transfer the waffle to the wire rack in the oven to keep warm. Repeat with the remaining batter to make 8 waffles.\n" +
                        "6.\tFor the chicken: Pour 5-inches of oil in a heavy-bottomed pot. Heat over medium-high heat until a deep-frying thermometer inserted in the oil reaches 360 degrees F.\n" +
                        "7.\tPlace the chicken thighs and buttermilk in a bowl. In a separate bowl, add the flour, garlic powder, onion powder, paprika, pepper and salt, and mix to combine. Dredge each thigh in the flour mix, then shake off any excess flour and carefully place in the oil. Fry until golden, 7 to 8 minutes. Remove the chicken to a paper bag or paper towels to drain excess grease and immediately season with salt.\n" +
                        "8.\tPlace each piece of fried chicken on top of a waffle and top each with some glaze and scallion greens to serve.\n",R.drawable.spicy_chicken_and_waffles,""));
        recipes1.add(new Recipes("Greek Inspired Cauliflower Stew","•\t1 lemon\n" +
                "•\tolive oil\n" +
                "•\t1 bulb of garlic\n" +
                "•\t2 red onions\n" +
                "•\t10 black olives , (stone in)\n" +
                "•\t300 g new potatoes\n" +
                "•\t½ a bunch of fresh oregano , (15g)\n" +
                "•\t10 large ripe plum tomatoes\n" +
                "•\t1 head of cauliflower , ideally with leaves (800g)\n" +
                "•\t200 g fresh or frozen peas , or broad beans\n","Method:",
                "1.\tPreheat the oven to 200ºC/400ºF/gas 6.\n" +
                        "2.\tUse a speed-peeler to strip the lemon zest into a large casserole pan on a medium heat, then add 2 tablespoons of oil and the garlic bulb.\n" +
                        "3.\tPeel and quarter the onions and separate into petals, destone the olives, and slice the potatoes 1cm-thick. Add to the pan, pick in the oregano leaves and cook for 5 minutes, or until just starting to soften and colour.\n" +
                        "4.\tQuarter and add the tomatoes, then season to taste with sea salt and black pepper.\n" +
                        "5.\tPour 500ml of water into the pan and bring to the boil, stirring well and scraping up any sticky bits from the bottom.\n" +
                        "6.\tDiscard just the tatty outer leaves from the cauliflower, then cut a cross into the stalk and push it right down to the bottom of the pan.\n" +
                        "7.\tDrizzle with 1 tablespoon of oil, cover, then place in the oven for 1 hour, or until golden and caramelised, basting occasionally and removing the lid halfway through.\n" +
                        "8.\tRemove the cauliflower to a serving platter and pick out the garlic bulb, then place the pan back over a medium heat on the hob, stir in the peas or broad beans, and simmer for 5 minutes.\n" +
                        "9.\tCarefully squeeze all the garlic out of the skins and stir back into the pan. Taste and tweak the seasoning, if needed, then pour over the cauliflower and finish with a good squeeze of lemon juice.\n",R.drawable.greekinspire,"Vegan"));
        recipes1.add(new Recipes("Chicken Alfredo","2 tbsp. \n" +
                "extra-virgin olive oil\n" +
                "2 \n" +
                "boneless skinless chicken breasts\n" +
                "Kosher salt\n" +
                "Freshly ground black pepper\n" +
                "1 1/2 c. \n" +
                "whole milk\n" +
                "1 1/2 c. \n" +
                "low-sodium chicken broth\n" +
                "2 \n" +
                "cloves garlic, minced\n" +
                "8 oz. \n" +
                "fetuccini\n" +
                "1/2 c. \n" +
                "heavy cream\n" +
                "1 c. \n" +
                "freshly grated Parmesan\n" +
                "Freshly chopped parsley, for garnish \n","Method:",
                "1.\tIn a large skillet over medium-high heat, heat oil. Add chicken and season with salt and pepper. Cook until golden and cooked through, 8 minutes per side. Let rest 10 minutes, then slice. \n" +
                        "2.\tAdd milk, broth, and garlic to skillet. Season with salt and pepper and bring to a simmer. Add fettuccine, stirring frequently for about 3 minutes. Let cook until al dente, 8 minutes more. \n" +
                        "3.\tStir in heavy cream and Parmesan until combined. Simmer until sauce thickens. \n" +
                        "4.\tRemove from heat and stir in sliced chicken. Garnish with parsley. \n",R.drawable.chikcen_alfredo,"Chicken Pasta"));

        recipes1.add(new Recipes("Meatloaf","•\t2 lbs ground beef, 85% or 90% lean\n" +
                "•\t1 med onion, finely chopped\n" +
                "•\t2 large eggs\n" +
                "•\t3 garlic cloves, minced\n" +
                "•\t3 Tbsp ketchup\n" +
                "•\t3 Tbsp fresh parsley, finely chopped\n" +
                "•\t3/4 cup Panko breadcrumbs\n" +
                "•\t1/3 cup milk\n" +
                "•\t1 ½ tsp salt, or to taste\n" +
                "•\t1 ½ tsp Italian seasoning\n" +
                "•\t¼ tsp ground black pepper\n" +
                "•\t½ tsp ground paprika\n" +
                "Meatloaf Sauce Ingredients:\n" +
                "•\t3/4 cup ketchup\n" +
                "•\t1 ½ tsp white vinegar\n" +
                "•\t2 ½ Tbsp brown sugar\n" +
                "•\t1 tsp garlic powder\n" +
                "•\t½ tsp onion powder\n" +
                "•\t¼ tsp ground black pepper\n" +
                "•\t¼ tsp salt\n","Method:",
                "1.\tLine a 9”x5” loaf pan with parchment paper and preheat oven to 375°F.\n" +
                        "2.\tIn a large bowl, add all of the ingredients for the meatloaf. Mix well to combine.\n" +
                        "3.\tAdd meat to the loaf pan, gently press meat down and shape evenly and bake meatloaf at 375˚F for 40 minutes.\n" +
                        "4.\tIn a small bowl, mix all of the ingredients together for the sauce. Spread the sauce over meatloaf then return to oven and bake additional 15-20 minutes. Rest meatloaf 10 minutes before slicing. Drizzle with baking juices from the pan. \n",R.drawable.meatloaf,""));

        recipes1.add(new Recipes("French Toast Waffles","•\tA loaf of bread – If you can find day-old bread, that’s even better!  You can make the recipe using white, wheat, or even gluten-free bread. This honey-wheat bread would be perfect.\n" +
                "•\tEggs\n" +
                "•\tMilk – Any variety will work, even nut milk.\n" +
                "•\tCinnamon\n" +
                "•\tSugar – The recipe calls for regular granulated sugar. To lower the calories, feel free to substitute the sugar with a cup-for-cup sugar substitute or coconut sugar.\n","Method:",
                "•\tPreheat waffle maker. (Spray the waffle maker with cooking spray if your style of waffle maker needs it.)\n" +
                        "•\tSlice bread into thick slices about an inch thick.\n" +
                        "•\tWhisk milk, eggs, cinnamon, and sugar together.\n" +
                        "•\tDunk each slice of bread into mixture and turn the bread to coat.\n" +
                        "•\tAllow the bread to slowly soak up egg mixture.\n" +
                        "•\tPlace onto a preheated waffle maker.\n" +
                        "•\tCook until golden brown.\n",R.drawable.french_toast_waffles,""));


        myRecyclerView = findViewById(R.id.recyclerView_id);

        myAdapter = new ListAdapter(this,recipes1);

        myRecyclerView.setLayoutManager(new GridLayoutManager(this,1));

        myRecyclerView.setAdapter(myAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        // We are using switch case because multiple icons can be kept
        switch (item.getItemId()) {
            case R.id.shareButton:

                Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                String shareBody = "Your Body Here";
                String shareSubject = "Your Subject Here";
                sharingIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
                sharingIntent.putExtra(Intent.EXTRA_SUBJECT, shareSubject);
                startActivity(Intent.createChooser(sharingIntent, "Share using"));
                break;

            case R.id.helpButton:

                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("Help");
                builder.setMessage("Do you need help?");
                builder.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        closeOptionsMenu();
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();

        }
        return super.onOptionsItemSelected(item);
    }
}