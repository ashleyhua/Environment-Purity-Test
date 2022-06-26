import java.util.*;
import java.lang.*;

public class EnvironmentPurityTest
{
    public static void main(String[] args)
    {
        String[] questions = {
        "Do you refrain from littering?", 
        "Do you sort your trash?", 
        "Do you try to stop your trash from flying if it doesn’t make its way into the right trash bin?", 
        "Do you participate in community cleanup events?", 
        "Do you recycle?", 
        "Do you reuse old items instead of constantly buying new ones?", 
        "Do you turn off lights when you leave a room?", 
        "Do you unplug chargers and anything wired when you don’t need to use them?", 
        "Do you hang your clothes dry?", 
        "Do you turn off digital devices when you aren’t using them?", 
        "Do you turn off the water when you brush your teeth?", 
        "Do you print double sided?", 
        "Do you use solar panels?", 
        "Do you grow your own vegetables and fruits?", 
        "Do you use a reusable water bottle?", 
        "Do you try to minimize your shower time?", 
        "Do you try to buy things in person rather than online?", 
        "Do you compost vegetable peels?", 
        "Do you buy second hand clothes?", 
        "Do you refrain from participating in fast fashion?", 
        "Do you buy eco-friendly clothes?", 
        "Do you try to fix up the clothes you currently have rather than throwing them away?", 
        "Do you drive an electricity powered car?", 
        "Do you ride on public transportation when you can?", 
        "Do you go to ethical banks rather than large banks?", 
        "Do you choose to use digital documents over print outs?", 
        "Do you eat more land animal meat than shrimp and lobster?", 
        "Do you eat more fish than land animal meat?", 
        "Do you sail more than fly?", 
        "Do you never throw out food?", 
        "Do you check the air filter and tire pressure of your car?", 
        "Do you own a programmable thermostat?", 
        "Do you try to minimize the number of times you need to drive around?", 
        "Do you try to carpool when possible?", 
        "Do you use renewable energy?", 
        "Do you own energy-efficient white goods (refrigerators, washing machines, dishwashers, etc.)?", 
        "Do you own ceiling fans?", 
        "Do you invest in insulation?", 
        "Would you choose to use fans over air conditioning?", 
        "Would you choose to buy meat at a butcher over a supermarket?", 
        "Would you choose LED lights over light bulbs?", 
        "Would you choose to wear cotton over nylon, polyester, or fleece?", 
        "Would you choose to walk over driving?", 
        "Would you choose fluorescent light bulbs over incandescent light bulbs?", 
        "Would you choose to wash your clothes in cold water and concentrated detergent over washing clothes in hot water and detergent capsules?",
        "Would you choose to use and buy less consumer goods than eco-friendly goods?", 
        "Would you choose vegetables over meat?", 
        "Would you choose eating vegetarian food over food that is grown near you?", 
        "Would you choose eating chicken over beef?", 
        "Would you choose to use reusable materials like glass over single use plastics?"};
        String[] info = {
        "Litter pollutes the air because when it is burned, it releases toxic emissions. Litter also often makes its way to the ocean and is ingested by sea creatures.", 
        "Sorting your trash allows less trash to end up in the landfill and more material that can be recycled. Less trash in landfills allows for less greenhouse gas emissions.", 
        "Making a simple effort to stop unintentional littering may seem like it wouldn’t make an impact, but making small steps towards a larger goal is always beneficial. :)", 
        "Participating in community cleanup events can help protect the environment and bring to people's attention that litter is harmful.", 
        "Recycling is important as many more eco-friendly products can be made with recycled materials and can reduce landfill and harmful emissions.", 
        "Reusing old items means less trash circulating and less harmful emissions in the environment.", 
        "Turning off lights can reduce your carbon footprint and reduce emissions due to electricity usage.", 
        "Chargers that are plugged in but aren’t in use create phantom power which is wasted electricity, so unplugging charges (although it might be a lot of work) helps save resources \n and the environment. Fun (not really) fact: phantom energy is responsible for roughly 10% of electricity usage which means that 10% of electricity created goes unused. ", 
        "Hanging your clothes dry does not impact your carbon footprint, whereas using the washing machine will as washing machines use large amounts of electricity and water and \n thus placing a negative impact on the environment. ", 
        "Turning off digital devices saves electricity that could be unused. This small action can also help you reduce your electricity bill. :D", 
        "Turning off the water while you brush saves the water supply. Although it may not seem like much, water is becoming scarce due to the worsening environment and global warming, \n so even saving a little is important. ", 
        "Printing double sided on paper means less paper is being used, which could be a major step towards stopping deforestation.", 
        "Solar panels help generate electricity and replace a portion of your electricity usage that comes from a larger provider such as PG&E. However, solar panels are quite pricey, \n so it would be understandable to not install these. ", 
        "Growing your own vegetables and fruits helps the environment since you no longer rely on vegetables that are transported to markets. Transporting foods does create a lot of \n emissions though it may not seem visible. ", 
        "Using a reusable water bottle reduces the amount of single use plastic that floats around Earth and reduces the chances that some poor animal would come across \n single use plastic and be harmed by it. ", 
        "By minimizing your shower time, you can save gallons of water at a time. Lowering water flow in your shower also helps with saving water. \n Fun fact: showering for 10 minutes is 18 gallons of water used (do you understand what I’m getting at here ;D)", 
        "Buying goods in person means you can reduce emissions that are released during transportation of your goods. In this world of online shopping (especially due to COVID-19), \n online shopping has expanded a lot, which means that a lot of emissions have been released in order to deliver consumer goods.", 
        "Composting vegetable peels into your soil makes your soil more fertile as these composted vegetable peels decompose within the soil and make the soil full of vitamins :D", 
        "Buying second hand clothes helps the environment as these clothes can be upcycled and worn again rather than being sent to landfills.", 
        "Fast fashion has been an important factor in harming the environment as companies often need to keep up with new trends and constantly make new clothes to keep up with \n consumer needs. By altogether refraining from participating in fast fashion, the harm caused by this industry can be mitigated. ", 
        "Eco friendly clothes, unlike fast fashion, are not made with petroleum-based materials, which results in a significantly smaller carbon footprint and reduces gas emissions. ", 
        "By fixing up your current clothes, you can prevent emissions being created in order to produce new clothes. Throwing away clothes results in more clothes ending up in landfills. ", 
        "Electricity cars leave a smaller carbon footprint than cars that rely on gasoline since they do not produce gas emissions, so it would be wise \n to invest in electricity powered cars. ", 
        "Public transportation itself may not reduce emissions, but since more people are on the same vehicle rather than on multiple vehicles, emissions are lowered.", 
        "Large banks are responsible for lots of fossil fuel emissions, which are a major factor that has been leading to climate change and global warming. Large banks also fund \n many large fossil fuel projects. ", 
        "Printouts have been contributing to deforestation, so when possible, using digital documents would be recommended.", 
        "Shrimp and lobster have been harmful to the environment not because of themselves but rather because gathering them requires more fuel for fishboats, and these fishboats \n are emitting harmful gasses. ", 
        "Normal fish are less harmful to the environment than say chicken and pork (which are the more eco-friendly land meats). Land animals  require lots of land to graze, \n which means that in order to farm these animals, deforestation is necessary. ", 
        "On average, sailing produces more emissions than flying. (However, it’s recommended that you limit flying and sailing because both notoriously leave \n a large carbon footprint as they require lots of fuel)", 
        "Throwing out food is bad for the environment as food that goes into the landfill rots and produces methane which is a harmful gas. Food that is thrown out also creates \n transportation emissions and wastes packaging that was used for the food itself.", 
        "Constantly maintaining your car comes with benefits as your car is more efficient and would rely less on energy. ", 
        "A programmable thermostat also helps reduce emissions as it can control itself when people are not inside the home, so energy wouldn’t be wasted on regulating \n the temperature of a home with no one inside. ", 
        "Trying to minimize the times you drive around reduces emissions as you would need to power your car less and you wouldn’t be releasing greenhouse gases while driving.", 
        "By carpooling, you can reduce emissions significantly since less cars would be necessary for the same number of people to get to their intended destination. ", 
        "Having a renewable energy provider is quite pricey, but it;s definitely a worthy investment since you no longer use energy that produces a great deal of emissions. " ,
        "Energy-efficient white goods are definitely important since less energy is used to serve the same purpose. ", 
        "Ceiling fans can reduce emissions since you would not need to rely on air conditioning which creates more emissions than ceiling fans do. ", 
        "Investing in insulation is expensive but a worthy investment since the demand for air conditioning would be lowered. Thus, there would be less emissions due to air conditioning. ", 
        "Fans are a lot less burdensome on the environment than air conditioning because they create little to no emissions whereas using air conditioning requires lots of energy, \n especially if you live in a relatively large home. ", 
        "Buying from a butcher is also more environmentally friendly since the meat does not come with much packaging whereas supermarket meat is typically wrapped in lots of plastic \n and has been transported long distances. ", 
        "LED lights require a lot less energy than light bulbs do, so it would be recommended to replace light bulbs with LED lights. ", 
        "Cotton is an eco-friendly fabric while the other three are made from petroleum based materials which are not eco-friendly. However, cotton is more pricey \n than the other three materials. ", 
        "Walking may seem tiring and unnecessary when you own a car, but your car creates lots of emissions, so walking is the more eco-friendly option. \n Walking is also a little bonus since you can get a small workout from it. ", 
        "Incandescent light bulbs require more energy to maintain compared to fluorescent light bulbs. So in order to minimize your carbon footprint, \n fluorescent light bulbs would be the better option. ", 
        "Cold water is more eco friendly compared to hot water as a lot of energy is used to heat up water. A lot of the energy used by washing machines is used to heat up \n the water (so washing by hand is also recommended). ", 
        "Although eco-friendly goods are definitely helpful towards protecting nature, in general using and buying less is even better since it saves the energy used \n to produce eco-friendly goods. ", 
        "Eating vegetables is the best dietary choice to save the environment since vegetables can be grown and maintained more easily than animals. Vegetables can also be grown in \n a variety of places, while animals typically need a specific area that they can graze. ", 
        "Eating vegetarian foods is more energy efficient than eating foods grown near you since you can reduce the resources needed to produce the foods you eat. ", 
        "Chicken is a lot more energy efficient than beef. (btw don’t refrain from eating meat simply because it leaves a carbon footprint since livestock is necessary \n for environmental balance)", 
        "Reusable materials save the resources needed to produce more single-use plastics. Single use plastics have also been commonly found in places such as the ocean \n and have been fatal risks for sea creatures. "};
        Scanner in = new Scanner(System.in);
        
        System.out.println("Welcome to the Environment Purity Test! ");
        System.out.println("We are going to ask you 50 questions about everyday common actions to determine how environmentally friendly you are.");
        System.out.println("Reply with 'y' if you perform the action, and 'n' if you do not.");
        System.out.println("With the environmentally friendly actions you do not do, we will provide some information on why they are good for the environment.");
        System.out.println("After the test, you will get a score between 0-100. 0 means that you are not environmentally friendly, and 100 means that you are very environmentally friendly.");
        System.out.println("DISCLAIMER: Many of these environmentally friendly actions require the person to be at a position of privilege.");
        System.out.println("We understand that not everybody is able to perform these environmentally beneficial actions, but hope that people will still try to do what they can. ");
        System.out.println("Please reply with 'yes' if  you are ready to take the test!");
        String reply = in.next();
        if(reply.equals("yes")){
            System.out.println("Perfect! The test will start now.");
        }
        else{
            System.out.println("Maybe next time!");
            System.exit(0);
        }
        System.out.println();
        int score = 100;
        for(int i = 0; i < 50; i++){
            System.out.println("Question " + (i+1) + ": " + questions[i]);
            String s = in.next();
            if(s.equals("n")){
                System.out.println("Here is some information on why it is environmentally beneficial to do this: " );
                System.out.println(info[i]);
                score -= 2;
            }
            else if(s.equals("y")){
                System.out.println("Good! Here is some information on why it is environmentally beneficial to do this: ");
                System.out.println(info[i]);
            }
        }
        System.out.println();
        System.out.println("Thank you for taking the Environment Purity Test! We hope that you have learned something new and will improve to help the environment in the future.");
        System.out.println("Your score is " + score);
        System.out.println();
        System.out.println("Sources: ");
        System.out.println("https://rebellion.global/blog/2020/08/20/reduce-your-carbon-footprint/");
        System.out.println("https://www.sciencenews.org/article/climate-change-actions-reduce-carbon-footprint");
        System.out.println("https://www.wri.org/insights/6-pressing-questions-about-beef-and-climate-change-answered");
        System.out.println("https://www.futurelearn.com/info/blog/50-sustainability-faqs-answered");
        System.out.println("https://www.earthrangers.com/cfi-quiz-answers/");
        System.out.println("https://www.teachengineering.org/content/cub_/lessons/cub_whatkindoffootprint/cub_footprint_lesson01_worksheetas_v3_tedl_dwc.pdf");
        System.out.println("https://8billiontrees.com/carbon-offsets-credits/quizzes-tests/carbon-footprint-quiz/");
        System.out.println("https://www.gokid.mobi/carbon-footprint-for-kids-some-facts-a-quiz-and-also-a-worksheet/");
        System.out.println("https://www.nytimes.com/interactive/2022/dining/climate-change-food-eating-habits.html");

    }

}
